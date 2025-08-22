package atividade2;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Luck", 10, "Shitzu");
        Cliente cliente1 = new Cliente("Lucas", 19, pet1);
        Cliente cliente2 = new Cliente("Mário", 75,
                new Pet("Thor", 5, "Pinscher"));

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
