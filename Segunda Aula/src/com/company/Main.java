package com.company;

import java.util.Scanner;

public class Main {


    public Main() {
    }

    public static void main(String[] args) {
        Aluno aluno;
        GerenciaAluno gerenciaAluno;
        gerenciaAluno = new GerenciaAluno();
        Scanner sc1 = new Scanner(System.in);

        boolean iniciaPrograma = true;



        while (iniciaPrograma){

            System.out.println("Digite opcao desejada: (1-Criar, 2-Listar, 9- sair) ");
            int numero = sc1.nextInt();

            switch (numero) {

                case 1:
                    System.out.println("Informe o nome do aluno: ");
                    String nomeAluno1 = sc1.next();

                    System.out.println("Informe a idade do aluno: ");
                    int idadeAluno1 = sc1.nextInt();

                    System.out.println("Informe o documento do aluno: ");
                    int docAluno1 = sc1.nextInt();

                    aluno = new Aluno(nomeAluno1, idadeAluno1, docAluno1);
                    gerenciaAluno.adicionaAluno(aluno);
                    break;

                case 2:
                    gerenciaAluno.listaAlunos();
                    break;

                case 9:
                    iniciaPrograma = false;
                    break;

            }
        }
    }
}
