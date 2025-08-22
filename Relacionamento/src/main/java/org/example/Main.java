package org.example;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Planeta dos Macacos", 157, "Salvador");
        Cliente cliente1 = new Cliente("Guilherme Fonseca", 18, endereco1);
        Cliente cliente2 = new Cliente("Nicolas Roger", 20,
                new Endereco("Bairro da Paz", 180, "Salvador"));

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}