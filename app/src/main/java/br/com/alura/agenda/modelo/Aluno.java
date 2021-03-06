package br.com.alura.agenda.modelo;

import java.io.Serializable;

public class Aluno implements Serializable {

    private long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String caminhoFoto;
    private String site;
    private Double nota;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCaminhoFoto() {  return caminhoFoto;  }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefoe) {
        this.telefone = telefoe;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void setCaminhoFoto(String caminhoFoto) { this.caminhoFoto = caminhoFoto;  }

    @Override
    public String toString() {
        return getId() + " - " + getNome();
    }
}
