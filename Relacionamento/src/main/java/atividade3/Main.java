package atividade3;

public class Main {
    public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario(1, "Guilherme",
            5000, Setor.FINANCEIRO, Sexo.MASCULINO, 19);
    Funcionario funcionario2 = new Funcionario(5, "Railane", 2500,
            Setor.VENDAS, Sexo.FEMININO, 19);

        System.out.println(funcionario1);
        System.out.println(funcionario2);

    }
}
