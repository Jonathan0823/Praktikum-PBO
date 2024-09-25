package tugas2;
import java.util.Scanner;

public class TabelRun {
    public static void main(String[] args) {
        // membuat input
        Scanner input = new Scanner(System.in);

        // input n
        System.out.print("Masukkan angka n : ");

        // membuat objek dan menampilkan tabel
        Tabel tabel = new Tabel(input.nextInt());
        input.close();
        tabel.showTable();
    }
}
