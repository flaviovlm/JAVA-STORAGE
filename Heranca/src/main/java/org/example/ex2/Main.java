package org.example.ex2;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Intel", "Core i7-11700K", 3.6);
        Memoria memoria1 = new Memoria("Kingston", "HyperX Fury", 16.0);
        PlacaMae placaMae = new PlacaMae("ASUS", "ROG STRIX B550-F", "AM4");
        DispositivoArmazen hd = new DispositivoArmazen("Seagate", "Barracuda 2TB", "2TB", "SATA III");

        System.out.println(processador1);
        System.out.println(memoria1);
        System.out.println(placaMae);
        System.out.println(hd);

    }
}
