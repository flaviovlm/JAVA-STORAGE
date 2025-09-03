package atividade1;

public class Cachorro implements Animal {
    @Override
    public String emitirSom() {
        return "Halls Halls!";
    }

    @Override
    public String comer() {
        return "Pedigree";
    }
}
