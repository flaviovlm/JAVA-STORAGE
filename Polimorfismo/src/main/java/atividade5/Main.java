package atividade5;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("João Silva", "123.456.789-00", "MG-12.345.678",
                Sexo.MASCULINO, 10000.00, "01/01/1970", "01/01/2020");

        Gerente gerente = new Gerente("Ana Souza", "321.654.987-00", "SP-98.765.432", Sexo.FEMININO,
                8000.00, "05/05/1980", "01/03/2021"
        );

        Motoboy motoboy = new Motoboy("Carlos Pereira", "456.789.123-00", "RJ-56.789.123",
                Sexo.MASCULINO, 2500.00, "10/10/1995", "15/06/2023", "ABC-1234"
        );

        Motoboy motoboy2 = new Motoboy("Lucas Almeida", "789.123.456-00", "RS-23.456.789",
                Sexo.MASCULINO, 2600.00, "20/08/1993", "01/07/2024", "XYZ-9876"
        );

        System.out.println(diretor);
        System.out.println();
        System.out.println(gerente);
        System.out.println();
        System.out.println(motoboy);
        diretor.admitir(motoboy);
        System.out.println();
        System.out.println(motoboy2);
        diretor.demitir(motoboy2);

    }
}
