package org.example;

public class MetodosString {
    public static void main(String[] args) {
        String nome = "Flávio";
        String sobrenome = "Vieira";

        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: "+sobrenome.length());

        String nomeCompleto = nome.concat(" ").concat((sobrenome));

        System.out.println("Concatenação Maiúscula: " +nomeCompleto.toUpperCase());
        System.out.println("Concatenação Minúscula: " +nomeCompleto.toLowerCase());

    }
}
