package org.example.ex3;

public class Main {
    public static void main(String[] args) {

        Fisica pessoaFisica = new Fisica(
                "João da Silva",
                "1199999-8888",
                "123.456.789-00",
                "12.345.678-9",
                "10/05/1990"
        );

        // Criando um objeto da classe Juridica
        Juridica pessoaJuridica = new Juridica(
                "Empresa XYZ Ltda",
                "1133333-2222",
                "12.345.678/0001-99",
                "123456789"
        );

        System.out.println(pessoaJuridica);
        System.out.println(pessoaFisica);
    }
}
