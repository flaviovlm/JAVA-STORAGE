package Exercicio2;

public enum Sexo {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');

    private String nome;
    private char sigla;

    Sexo(String nome, char sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }
}
