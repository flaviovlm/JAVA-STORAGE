package atividade5;

public class Diretor extends CargoDeConfianca implements Contratacao{

    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
        super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao, Bonificacao.DIRETOR);
    }


    @Override
    public double getSalarioFinal() {
        return (super.salarioBase * super.bonificacao.getValor()) * this.PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println(""+funcionario.nome+ " foi admitido!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println(""+funcionario.nome+ " foi demitido!");

    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
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
