package org.example.ex2;

public class Memoria extends Especificacao{

    private double capacidadeArmazen;

    public Memoria(String marca, String modelo, double capacidadeArmazen) {
        super(marca, modelo);
        this.capacidadeArmazen = capacidadeArmazen;
    }

    public double getCapacidadeArmazen() {
        return capacidadeArmazen;
    }

    public void setCapacidadeArmazen(double capacidadeArmazen) {
        this.capacidadeArmazen = capacidadeArmazen;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeArmazen=" + capacidadeArmazen +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }


}
