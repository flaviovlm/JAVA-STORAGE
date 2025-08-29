package org.example.ex1;

public class Funcionario extends Pessoa {

    private String matricula;
    private String cargo;
    private double salario;

    public Funcionario(int idade, String nome, String matricula, String cargo, double salario) {
        super(idade, nome);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", matricula='" + matricula + '\'' +
                ", cargo='" + cargo + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
