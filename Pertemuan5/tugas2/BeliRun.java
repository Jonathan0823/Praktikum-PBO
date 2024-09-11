package tugas2;
import java.util.Scanner;

/**
 * BeliRun
 */
public class BeliRun {

    public static void main(String[] args) {
        
        int harga;
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Total pembelian Rp. = ");
        harga = input.nextInt();

        // Membuat objek dan memanggil method
        Beli cust1 = new Beli(harga);
        input.close();
        cust1.pembelian();
    }
}