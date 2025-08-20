package atividade_1;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int quantidadePets = 0;
        ArrayList <Pets> listaPets = new ArrayList<>();

        do {

            System.out.println("---- MENU ----");
            System.out.println("1. Cadastrar Pet");
            System.out.println("2. Exibir Pets ["+quantidadePets+"]");
            System.out.println("3. Sair");
            System.out.printf("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.print("Nome do Pet: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade (em anos): ");
                    int idade = sc.nextInt();
                    System.out.print("Raça: ");
                    String raca = sc.next();
                    System.out.print("Porte (pequeno, médio ou grande): ");
                    String porte = sc.next();
                    System.out.print("Alimentação (marca da ração): ");
                    String alimentacao = sc.next();
                    System.out.println("Pet cadastrado com sucesso!");
                    Pets pets = new Pets(nome,idade,raca,porte,alimentacao);
                    listaPets.add(pets);
                    quantidadePets++;
                    break;
                case 2:
                    if (quantidadePets == 0){
                        System.out.println("Necessário cadastrar um Pet primeiro!");
                        break;
                    }
                    System.out.println(listaPets.toString());
                    break;
                default:
                    System.out.println("Digite de 1 à 3, babaca!");
                    break;
            }

        }while (opcao != 3);

    }
}