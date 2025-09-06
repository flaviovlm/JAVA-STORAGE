package atividade5;

public class Motoboy extends Funcionario {

    private String placaDeMoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao, String placaDeMoto) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao);
        this.placaDeMoto = placaDeMoto;
    }

    public String getPlacaDeMoto() {
        return placaDeMoto;
    }

    public void setPlacaDeMoto(String placaDeMoto) {
        this.placaDeMoto = placaDeMoto;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDeMoto='" + placaDeMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.getSalarioFinal() +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }
}
