package org.example.ex2;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Intel", "Core i7-11700K", 3.6);
        Memoria memoria1 = new Memoria("Kingston", "HyperX Fury", 16.0);

        System.out.println(processador1);
        System.out.println(memoria1);

    }
}
