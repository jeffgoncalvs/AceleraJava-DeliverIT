package com.company;
import java.util.Scanner;

public class Main {




    public Main(){
    }

    public static void main(String[] args) {
        Aluno aluno;
        GerenciaAluno gerenciaAluno;
        gerenciaAluno = new GerenciaAluno();
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        sc1.




        Aluno aluno1 = new Aluno(sc1.nextLine(), sc1.nextInt(),1234567890);
        Aluno aluno2 = new Aluno("Fulano da Silva2", 7,1234567890);
        Aluno aluno3 = new Aluno("Fulano da Silva3", 11,123490);
        Aluno aluno4 = new Aluno(null, null,null);
        Aluno aluno5 = new Aluno("Fulano da Silva4", 60,1234567890);
        Aluno aluno6 = new Aluno("Fulano da Silva5",null ,1234567890);
        Aluno aluno7 = new Aluno("Fulano da Silva", 11,null);

        gerenciaAluno.adicionaAluno(aluno1);
        gerenciaAluno.adicionaAluno(aluno2);
        gerenciaAluno.adicionaAluno(aluno3);
        gerenciaAluno.adicionaAluno(aluno4);
        gerenciaAluno.adicionaAluno(aluno5);
        gerenciaAluno.adicionaAluno(aluno6);
        gerenciaAluno.adicionaAluno(aluno7);


    }
}
