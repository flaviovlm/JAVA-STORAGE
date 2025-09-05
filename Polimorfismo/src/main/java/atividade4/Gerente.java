package atividade4;

public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println(""+funcionario.nome+" foi admitido!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println(""+ funcionario.nome + " foi demitido!");
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + obterSalarioFinal() +
                '}';
    }
}
