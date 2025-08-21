package atividade_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("FFFF-6666", "Cinza", 50,8,276,36.7);
        Livro livro1 = new Livro("Minha Luta", "Adolf Guilherme", "978-85-12345-67-8",700, 79.99);
        Cliente cliente1 = new Cliente("Flávio", 20, "111.222.333-44","Rua alemanha", "71981339100");
        System.out.println(veiculo1.toString());
        System.out.println();
        System.out.println(livro1.toString());
        System.out.println();
        System.out.println(cliente1.toString());
    }

}
