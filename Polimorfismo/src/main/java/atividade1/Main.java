package atividade1;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Galo cock = new Galo();
        Pato duck = new Pato();

        System.out.println(dog.emitirSom());
        System.out.println(dog.comer());
        System.out.println(cat.emitirSom());
        System.out.println(cat.comer());
        System.out.println(duck.emitirSom());
        System.out.println(duck.comer());
        System.out.println(cock.emitirSom());
        System.out.println(cock.comer());



    }
}
