package atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Diretor diretor1 = new Diretor("Flávio", "10/08/2005",
                Sexo.MASCULINO,Setor.FINANCEIRO,10000);

        Motoboy motoboy1 = new Motoboy("Leonardo", "20/07/2000",
                Sexo.MASCULINO,Setor.OPERACOES,5000, "1000000");

        Motoboy motoboy2 = new Motoboy("Kailane", "17/07/2005",
                Sexo.FEMININO,Setor.OPERACOES, 3000, "2000000");

        System.out.println("-- DIRETOR --");
        System.out.println(diretor1.toString());
        System.out.println("-- MOTOBOY --");
        System.out.println(motoboy1);
        diretor1.admitir(motoboy1);
        System.out.println();
        System.out.println(motoboy2);
        diretor1.demitir(motoboy2);
    }
}
