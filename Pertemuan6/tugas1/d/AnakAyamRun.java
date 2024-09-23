package tugas1.d;

import java.util.Scanner;

public class AnakAyamRun {
    public static void main(String[] args) {
        // isRunning untuk uncounted loop
        boolean isRunning = true;

        //input
        Scanner input = new Scanner(System.in);

        //uncounted loop agar mendapat input yang benar
        while (isRunning) {
            try {
                System.out.print("Masukkan Jumlah anak ayam: ");
                AnakAyam ayam = new AnakAyam(input.nextInt());
                ayam.songstart();
                isRunning = false;
            } catch (Exception e) {
                //menggunakan try catch agar mengabaikan input yang bukan integer dan menghindari program yang berhenti
                System.out.println("Input harus bilangan bulat");
                //flush junk dari input sebelumnya
                input.nextLine();
            }
        }

        input.close();
    }
}
