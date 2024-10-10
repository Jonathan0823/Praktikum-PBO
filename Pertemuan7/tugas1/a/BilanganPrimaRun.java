package tugas1.a;
import java.util.Scanner;

public class BilanganPrimaRun {
    public static void main(String[] args) {

        // membuat input
        Scanner input = new Scanner(System.in);

        // input angka
        System.out.print("Masukkan angka : ");

        // membuat objek angka
        BilanganPrima angka = new BilanganPrima(input.nextInt());
        input.close();

        // memanggil method
        angka.primaFor();
        angka.notPrimaFor();
    }
}
