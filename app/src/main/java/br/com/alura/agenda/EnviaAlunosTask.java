package br.com.alura.agenda;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.List;

import br.com.alura.agenda.DAO.AlunoDAO;
import br.com.alura.agenda.converter.AlunoConverter;
import br.com.alura.agenda.modelo.Aluno;

/**
 * Created by thiago on 17/06/18.
 */

public class EnviaAlunosTask extends AsyncTask<Object, Object, String> {


    private Context context;
    private ProgressDialog dialog;

    public EnviaAlunosTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        dialog = ProgressDialog.show(context, "Aguarde", "Enviando alunos...", true, true);

    }

    @Override
    protected String doInBackground(Object... objects) {


        AlunoDAO alunoDAO = new AlunoDAO(context);
        List<Aluno> alunos = alunoDAO.buscaAlunos();
        alunoDAO.close();

        AlunoConverter conversor = new AlunoConverter();
        WebClient client = new WebClient();
        String json = conversor.converteParaJson(alunos);
        String resposta = client.post(json);
        return resposta;
    }

    @Override
    protected void onPostExecute(String responstaRequest) {
        dialog.dismiss();
        Toast.makeText(context, responstaRequest, Toast.LENGTH_LONG).show();
    }
}
