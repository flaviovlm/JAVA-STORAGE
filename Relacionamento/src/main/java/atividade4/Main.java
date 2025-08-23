package atividade4;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Santander",  "0426", "111111111",
                TipoConta.POUPANCA,5000,2000);

        Endereco endereco1 = new Endereco("Rua Direta Tancredo Neves", "716", "Salvador");

        Funcionario funcionario1 = new Funcionario("388482","Flavio",endereco1,
                "71984841742", "flavinhodopneu@outlook.com", conta1);

        System.out.println(conta1);
        System.out.println();
        System.out.println(funcionario1);
    }
}
