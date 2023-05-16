import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[20];

        System.out.println("Masukkan 20 angka:");

        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }

        Form test = new Form(angka);
        boolean cari = test.angkaSama();

        if (cari) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
    }
}