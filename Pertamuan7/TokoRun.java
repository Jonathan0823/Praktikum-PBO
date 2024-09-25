import java.util.Scanner;

public class TokoRun {
    public static void main(String[] args) {
        int total_harga = 0;
        int jumlah_item = 0;


        System.out.println("TOKO SERBA ADA");
        System.out.println("***********************");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Item Barang : ");
        jumlah_item = input.nextInt();
        Toko toko = new Toko(jumlah_item);

        for(int i = 0; i < jumlah_item; i++) {
            System.out.println("Data ke " + (i+1));
            System.out.print("Masukkan Kode : ");
            String kode = input.next();
            System.out.print("Masukkan Jumlah Beli : ");
            int jumlah_beli = input.nextInt();

            total_harga += toko.getTotalHarga(kode, jumlah_beli);
        }

        System.out.println("\n\n\nTOKO SERBA ADA");
        System.out.println("***********************");
        System.out.println("No  Kode Barang   Nama Barang    Harga   Jumlah Beli   Total Harga");
        System.out.println("====================================================================");
        toko.print_data();
        System.out.println("====================================================================");
        System.out.format("Total Harga :                                         Rp. %,d\n", total_harga);
        System.out.println("====================================================================");





        input.close();
    }
}
