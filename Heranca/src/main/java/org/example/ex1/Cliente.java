package org.example.ex1;

public class Cliente extends Pessoa{

    private String dataCompra;
    private String formadePagamento;

    public Cliente(int idade, String nome, String dataCompra, String formadePagamento) {
        super(idade, nome);
        this.dataCompra = dataCompra;
        this.formadePagamento = formadePagamento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getFormadePagamento() {
        return formadePagamento;
    }

    public void setFormadePagamento(String formadePagamento) {
        this.formadePagamento = formadePagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataCompra='" + dataCompra + '\'' +
                ", formadePagamento='" + formadePagamento + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
