package atividade1;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Galo cock = new Galo();
        Pato duck = new Pato();

        System.out.println("Som cachorro: ");
        System.out.println(dog.emitirSom());
        System.out.println("Comida cachorro: ");
        System.out.println(dog.comer());
        System.out.println("Som Gato: ");
        System.out.println(cat.emitirSom());
        System.out.println("Comida gato: ");
        System.out.println(cat.comer());
        System.out.println("Som Pato: ");
        System.out.println(duck.emitirSom());
        System.out.println("Comida Pato: ");
        System.out.println(duck.comer());
        System.out.println("Som Galo: ");
        System.out.println(cock.emitirSom());
        System.out.println("Comida Galo: ");
        System.out.println(cock.comer());



    }
}
