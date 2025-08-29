package org.example.ex2;

public class DispositivoArmazen extends Especificacao{

    private String capacidadeArmazen;
    private String tipoConexao;

    public DispositivoArmazen(String marca, String modelo, String capacidadeArmazen, String tipoConexao) {
        super(marca, modelo);
        this.capacidadeArmazen = capacidadeArmazen;
        this.tipoConexao = tipoConexao;
    }

    public String getCapacidadeArmazen() {
        return capacidadeArmazen;
    }

    public void setCapacidadeArmazen(String capacidadeArmazen) {
        this.capacidadeArmazen = capacidadeArmazen;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return "DispositivoArmazen{" +
                "capacidadeArmazen='" + capacidadeArmazen + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                '}';
    }
}
