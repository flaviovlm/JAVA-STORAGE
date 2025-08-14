package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Double> notas = new ArrayList<>();
        String resposta;
        double notaInformada;
        do {

            do {
                System.out.println("Digite uma nota: ");
                notaInformada = sc.nextDouble();
                if (notaInformada < 0 || notaInformada >10){
                    System.out.println("Digite corretamente, imbecil!");
                }
            }while ( notaInformada < 0 || notaInformada >10);
            notas.add(notaInformada);

            System.out.println("Deseja inserir mais uma nota? ");
            System.out.println("\nPressione a tecla N para sair.");
            resposta = sc.next();
        }while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas: ");
        for (double nota: notas){
            System.out.println("Nota: "+nota);
        }
    }
}
