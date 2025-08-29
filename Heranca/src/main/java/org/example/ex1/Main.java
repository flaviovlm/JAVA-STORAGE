package org.example.ex1;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(35, "Carlos Silva", "F123", "Gerente", 7500.00);
        Cliente cliente1 = new Cliente(28, "Mariana Costa", "29/08/2025", "Cartão de Crédito");

        System.out.println(cliente1);
        System.out.println(funcionario1);
    }
}
