package org.example;

import java.util.Scanner;

public class Relacionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,  num2;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        sc.nextLine();

        if (num1 > num2){
            System.out.println("Maior: "+num1);
        } else if (num1 == num2) {
            System.out.println("São iguais");
        } else {
            System.out.println("Maior: "+num2);
        }
    }
}
