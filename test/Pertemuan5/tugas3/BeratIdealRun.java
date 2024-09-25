package tugas3;
import java.util.Scanner;

public class BeratIdealRun {
    public static void main(String[] args) {
        float berat;
        float tinggi;

        // membuat objek untuk input
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Berat Badan Ideal\n");

        // Input
        System.out.print("Masukkan berat badan (kg) : ");
        berat = input.nextFloat();
        System.out.print("Masukkan tinggi badan (cm) : ");
        tinggi = input.nextFloat();

        input.close();

        // Membuat objek dan memanggil method
        BeratIdeal berat1 = new BeratIdeal(berat, tinggi);
        berat1.showbmi();
    }
}
