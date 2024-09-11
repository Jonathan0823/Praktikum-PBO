package tugas1;
import java.util.Scanner;


public class DataRun {
    public static void main(String[] args) {
        
        // Membuat objek
        Data mahasiswa = new Data();
        
        // Membuat variabel input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NPM : ");
        mahasiswa.NIM = input.nextLong();
        input.nextLine();
        System.out.print("Masukkan Nama : ");
        mahasiswa.Nama = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran : ");
        mahasiswa.NilaiKehadiran = input.nextFloat();
        System.out.print("Masukkan Nilai Tugas : ");
        mahasiswa.NilaiTugas = input.nextFloat();
        System.out.print("Masukkan Nilai UTS : ");
        mahasiswa.NilaiUTS = input.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        mahasiswa.NilaiUAS = input.nextFloat();
        
        // Memanggil method
        mahasiswa.Grade();
        mahasiswa.display();
        input.close();
    }
}
