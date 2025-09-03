package atividade1;

public class Pato implements Animal{

    @Override
    public String emitirSom() {
        return "Quen Quen";
    }

    @Override
    public String comer() {
        return "Milho";
    }
}
