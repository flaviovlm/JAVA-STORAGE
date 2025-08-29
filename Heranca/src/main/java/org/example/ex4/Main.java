package org.example.ex4;

public class Main {
    public static void main(String[] args) {
                // Criando um endereço
                Endereco end1 = new Endereco(
                        "Rua Planeta dos Macacos",
                        "123",
                        "Ao lado do beco sem saída",
                        "40000-000",
                        "Salvador"
                );
                Endereco end2 = new Endereco(
                        "Rua disneylândia",
                        "500",
                        "Ao lado do bairro da paz",
                        "40100-000",
                        "Salvador"
                );
                // Criando um engenheiro
                Engenheiro eng = new Engenheiro(
                        "Carlos Souza",
                        "carlos.souza@email.com",
                        8500.00f,
                        end1,
                        "CREA-BA12345"
                );

                // Criando um médico
                Medico med = new Medico(
                        "Mariana Lima",
                        "mariana.lima@email.com",
                        12000.00f,
                        end2,
                        "CRM-BA67890"
                );

        System.out.println(med);
        System.out.println(eng);
    }
}
