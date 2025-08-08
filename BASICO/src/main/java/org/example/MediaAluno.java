package org.example;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double nota1, nota2, media;

        System.out.println("Nome do aluno: ");
        nome = sc.next();
        System.out.print("Digite a nota 1: ");
        nota1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Digite a nota 2: ");
        nota2 = sc.nextDouble();
        sc.nextLine();

        media = (nota1 + nota2)/2;

        System.out.println("ALUNO: "+nome);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        if (media >= 7.0){
            System.out.println("Media "+media +"| APROVADO");
        } else {
            System.out.println("Media "+media+"| REPROVADO");
        }

    }
}
