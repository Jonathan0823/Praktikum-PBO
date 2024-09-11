package tugas1.b;
import java.util.Scanner;

public class GanjilGenapRun {
    public static void main(String[] args) {

        // membuat input
        Scanner input = new Scanner(System.in);

        // input angka
        System.out.print("Masukkan angka : ");
        
        // membuat objek angka
        GanjilGenap angka = new GanjilGenap(input.nextInt());
        input.close();

        // memanggil method
        System.out.println("Loop menggunakan for");
        angka.ganjilFor();
        angka.genapFor();
        
        System.out.println("\nLoop menggunakan while");
        angka.ganjilWhile();
        angka.genapWhile();
        
        System.out.println("\nLoop menggunakan do while");
        angka.ganjilDoWhile();
        angka.genapDoWhile();
    }
}
