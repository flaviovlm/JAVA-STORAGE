package org.example;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int quantNota = 2;
        double[] notas = new double[quantNota];
        double media = 0, soma = 0;

        for (int i = 0; i < 2; i++) {
                while (notas[i] < 1 || notas[i] > 10) {

                    System.out.println("Digite a " + (i + 1) + " nota: ");
                    notas[i] = sc.nextDouble();
                    if (notas[i] < 0 || notas[i] > 10) {
                        System.out.println("Seu bastardo! Digite de 1 à 10!\n");
                    }
                }
            soma += notas[i];
        }

        media = soma / quantNota;

        System.out.println("\n---- Notas -----");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);

        }
        System.out.println("Media: "+media);

    }
}

