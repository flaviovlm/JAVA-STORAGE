package org.example;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        int opcao;

        do {

            System.out.println("---- MENU ----");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.println("5. Sair");
            System.out.printf("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("===== ADIÇÃO =====\n");
                    System.out.print("Digite o numero 1: ");
                    num1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite o numero 2: ");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " +resultado);
                    break;
                case 2:
                    System.out.println("===== SUBTRAÇÃO =====\n");

                    System.out.print("Digite o numero 1: ");
                    num1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite o numero 2: ");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " +resultado);
                    break;
                case 3:
                    System.out.println("===== DIVISÃO =====\n");

                    System.out.print("Digite o numero 1: ");
                    num1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite o numero 2: ");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    resultado = num1 / num2;
                    System.out.println("Resultado: " +resultado);
                    break;
                case 4:
                    System.out.println("===== MULTIPLICAÇÃO =====\n");
                    System.out.print("Digite o numero 1: ");
                    num1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Digite o numero 2: ");
                    num2 = sc.nextDouble();
                    sc.nextLine();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " +resultado);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.printf("Digite de 1 a 5\n");
                break;
            }

        }while (opcao != 5);

    }
}
