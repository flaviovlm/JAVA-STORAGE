package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Planeta dos Macacos", 157,
                "Fica do lado do beco sem saída","157171150", "Salvador", UnidadeFederativa.BAHIA);


        Pessoa pessoa1 = new Pessoa(1, "Nikolas",
            19, "71999998877","nikolasscooter@gmail.com",
            Sexo.FEMININO, endereco1);

        System.out.println(pessoa1);
    }
}
