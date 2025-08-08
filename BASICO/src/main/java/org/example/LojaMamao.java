package org.example;

import java.util.Scanner;

public class LojaMamao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCompra = 0, valorParcela;
        double mamao = 100.99, pepino = 50.79, melancia = 75.99;


        System.out.println("===== MAMÃO AÇÚCAR ====\n");
        System.out.println("----- PRODUTOS -----");
        System.out.println("1. Mamão | R$ 100.99");
        System.out.println("2. Pepino | R$ 50.79 ");
        System.out.println("3. Melancia | R$ 75.99");
        System.out.println("Escolha o produto: ");
        int opcaoProduto = sc.nextInt();
        sc.nextLine();

        if (opcaoProduto== 1){
            valorCompra = mamao;
            System.out.println("Produto - Mamão");
            System.out.println("Valor - R$ "+mamao);
            System.out.println("Vai parcelar de quantas vezes? (MAX. 5)");
            int opcaoParcela = sc.nextInt();
            sc.nextLine();
            System.out.println("==== MAMAO AÇÚCAR AGRADECE ====");
            System.out.println("--- NOTA FISCAL ---");
            System.out.println("Produto - Mamão | R$ "+mamao);
            System.out.println("O valor das parcelas ficaram de: R$ "+valorCompra/opcaoParcela);

        }else if (opcaoProduto == 2){

            valorCompra = pepino;
            System.out.println("Produto - Pepino");
            System.out.println("Valor - R$ "+pepino);
            System.out.println("Vai parcelar de quantas vezes? (MAX. 5)");
            int opcaoParcela = sc.nextInt();
            sc.nextLine();
            System.out.println("==== MAMAO AÇÚCAR AGRADECE ====");
            System.out.println("--- NOTA FISCAL ---");
            System.out.println("Produto - Pepino | R$ "+pepino);
            System.out.println("O valor das parcelas ficaram de: R$ "+valorCompra/opcaoParcela);
        } else if (opcaoProduto == 3){
            valorCompra = melancia;
            System.out.println("Produto - Melancia");
            System.out.println("Valor - R$ "+melancia);
            System.out.println("Vai parcelar de quantas vezes? (MAX. 5)");
            int opcaoParcela = sc.nextInt();
            sc.nextLine();
            System.out.println("==== MAMAO AÇÚCAR AGRADECE ====");
            System.out.println("--- NOTA FISCAL ---");
            System.out.println("Produto - Melancia | R$ "+melancia);
            System.out.println("O valor das parcelas ficaram de: R$ "+valorCompra/opcaoParcela);

        }
    }



}
