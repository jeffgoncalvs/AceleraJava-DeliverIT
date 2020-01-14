package com.company;

public class Aluno {
    String nome;
    Integer idade;
    Integer documento;


    public Aluno(String nomeDoAluno, Integer idadeDoAluno, Integer documentoDoAluno){
    nome = nomeDoAluno;
    idade=idadeDoAluno;
    documento=documentoDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }
    public Integer getDocumentoAluno(){
        return documento;
    }

}
