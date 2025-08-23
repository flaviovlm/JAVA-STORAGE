package atividade4;

public class Funcionario {
    private String codigoFuncionario;
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBanco;

    public Funcionario(String codigoFuncionario, String nome, Endereco endereco, String telefone, String email, ContaBancaria contaBanco) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(ContaBancaria contaBanco) {
        this.contaBanco = contaBanco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigoFuncionario='" + codigoFuncionario + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", contaBanco=" + contaBanco +
                '}';
    }
}

