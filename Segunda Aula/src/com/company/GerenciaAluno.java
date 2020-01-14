package com.company;

import java.util.ArrayList;
import java.util.List;

public class GerenciaAluno {
    List<Aluno> listaAlunos;
   // Aluno aluno;

    public GerenciaAluno() {
        listaAlunos = new ArrayList<>();

    }

    public void adicionaAluno(Aluno novoAluno) {
        if (novoAluno.getNome() == null || novoAluno.idade == null || novoAluno.getDocumentoAluno() == null) {
            System.out.println("Dados nao podem ser em branco");
        } else if (novoAluno.getIdade() < 10 || novoAluno.getIdade() > 18) {
            System.out.println("Idade Invalida");

        } else if (novoAluno.getDocumentoAluno().toString().length() < 10) {
            System.out.println("Documento Invalido");

        } else {
            listaAlunos.add(novoAluno);
            System.out.println("Aluno adicionando");
        }
    }
}
