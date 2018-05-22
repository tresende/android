package br.com.alura.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] alunos = {"Ronaldo", "Daniel", "Felipe", "Jerferson", "Daniel", "Felipe", "Jerferson", "Daniel", "Felipe", "Jerferson", "Daniel", "Felipe", "Jerferson" };
        ListView listaAlunos = (ListView)findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adpter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adpter);

        Button novoAluno = (Button)findViewById(R.id.novo_aluno);
        novoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiProFormulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(intentVaiProFormulario);
            }
        });
    }
}
