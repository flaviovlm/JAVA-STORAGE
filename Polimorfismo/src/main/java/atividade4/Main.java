package atividade4;

public class Main {
    public static void main(String[] args) {

        Motoboy motoboy1 = new Motoboy("Leonardo", "111.222.333-75"
        , "15/07/2005", 5000, "JJJ666");

        Motoboy motoboy2 = new Motoboy("Kailane", "222.333.555-66"
        ,"11/10/2020", 2000, "LLL098");
        Gerente gerente = new Gerente("Flávio", "000.999.888-77",
                "10/08/2005", 10000);


        System.out.println(gerente);
        System.out.println();
        System.out.println(motoboy1);
        gerente.admitir(motoboy1);
        System.out.println();
        System.out.println(motoboy2);
        gerente.demitir(motoboy2);
    }
}
