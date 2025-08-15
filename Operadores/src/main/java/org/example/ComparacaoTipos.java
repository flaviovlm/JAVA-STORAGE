package org.example;

import java.util.Scanner;

public class ComparacaoTipos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomeUsuario, nomeUsuarioConfirma;
        int senha, senhaConfirma;

        System.out.println("Insira seu nome");
        System.out.print("Nome: ");
        nomeUsuario = sc.next();

        System.out.println("Digite sua senha (só números)");
        System.out.print("Senha: ");
        senha = sc.nextInt();

            System.out.println("Confirme seu nome: ");
            nomeUsuarioConfirma = sc.next();

            System.out.println("Confirme a senha: ");
            senhaConfirma = sc.nextInt();

            boolean resultadoNome = nomeUsuario.equals(nomeUsuarioConfirma);
            boolean resultadoSenha = (senha == senhaConfirma);

            if (resultadoNome && resultadoSenha) {
                System.out.println("Bem-vindo " + nomeUsuario + ", você está logado!");
            } else {
                System.out.println("Dados inválidos. Tente novamente, boçal!");
            }

    }


}
