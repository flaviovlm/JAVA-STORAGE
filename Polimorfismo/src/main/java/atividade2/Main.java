package atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a , b;
        int opcao;
        Soma soma = new Soma();
        Multiplicacao multiplicacao = new Multiplicacao();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();

        do {
            System.out.println("----- CALCULADORA -----");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.println("Opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){

                case 1:
                    System.out.println("Digite o numero A: ");
                    a = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o numero B: ");
                    b = sc.nextDouble();
                    sc.nextLine();

                    System.out.println(" "+a+ " + "+b+" = "+soma.calcular(a,b));
                    break;
                case 2:
                    System.out.println("Digite o numero A: ");
                    a = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o numero B: ");
                    b = sc.nextDouble();
                    sc.nextLine();

                    System.out.println(" "+a+ " - "+b+" = "+subtracao.calcular(a,b));
                    break;
                case 3:
                    System.out.println("Digite o numero A: ");
                    a = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o numero B: ");
                    b = sc.nextDouble();
                    sc.nextLine();

                    System.out.println(" "+a+ " x "+b+" = "+multiplicacao.calcular(a,b));
                    break;
                case 4:
                    System.out.println("Digite o numero A: ");
                    a = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o numero B: ");
                    b = sc.nextDouble();
                    sc.nextLine();

                    System.out.println(" "+a+ " : "+b+" = "+divisao.calcular(a,b));
                    break;
                case 5:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Digite de 1 à 5!");
                    break;
            }

        }while (opcao != 5);
    }
}
