package atividade1;

public class Gato  implements Animal{
    @Override
    public String emitirSom() {
        return "Meow Meow!";
    }

    @Override
    public String comer() {
        return "Whiskas";
    }
}
