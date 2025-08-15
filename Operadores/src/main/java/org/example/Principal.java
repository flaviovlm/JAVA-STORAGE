package org.example;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        p1.setNome("Marta");
        p1.setCpf("000.111.222-33");
        p2.setNome("Flávio");
        p2.setCpf("111.222.333-44");
        System.out.println("Nome: "+p1.getNome());
        System.out.println("CPF: "+ p1.getCpf());

        System.out.println("Nome: "+p2.getNome());
        System.out.println("CPF: "+ p2.getCpf());
    }
}
