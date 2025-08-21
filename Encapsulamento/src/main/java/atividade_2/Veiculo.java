package atividade_2;

public class Veiculo {
    private String placa;
    private String cor;
    private int numeroPassageiro;
    private int capacidadeTanque;
    private int velocidadeMax;
    private double consumo;

    // Construtor
    public Veiculo(String placa, String cor, int numeroPassageiro, int capacidadeTanque, int velocidadeMax, double consumo) {
        this.placa = placa; // Usa o 'this' para referir ao atributo da classe
        this.cor = cor;
        this.numeroPassageiro = numeroPassageiro;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMax = velocidadeMax;
        this.consumo = consumo;
    }

    // Métodos getters e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa; // Corrigido o 'this'
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor; // Corrigido o 'this'
    }

    public int getNumeroPassageiro() {
        return numeroPassageiro;
    }

    public void setNumeroPassageiro(int numeroPassageiro) {
        this.numeroPassageiro = numeroPassageiro;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    // Método toString para exibição dos atributos do Veículo
    @Override
    public String toString() {
        return "Veiculo" +
                "\nPlaca = " + placa +
                "\nCor = " + cor +
                "\nNumero de Passageiros = " + numeroPassageiro +
                "\nCapacidade do Tanque = " + capacidadeTanque +
                "\nVelocidade Máxima = " + velocidadeMax +
                "\nConsumo = " + consumo;
    }
}
