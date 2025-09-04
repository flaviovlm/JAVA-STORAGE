package atividade3;

public enum Setor {
    RECURSOS_HUMANOS("RH"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operações");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
