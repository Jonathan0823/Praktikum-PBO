import java.util.Arrays;
public class Toko {
    int jumlah_barang;
    int total_barang = 3;
    // static int total_harga;


    String [] kode_hasil = {
        
    };

    int [] jumlah_hasil = {
        
    };

    String[] kode_barang = {
        "a001", "a002", "a003"
    };

    String[] nama_barang = {
        "Buku", "Pensil", "Pulpen"
    };

    int[] harga_barang = {
        3000, 4000, 5000
    };

    public Toko(int jumlah) {
        this.jumlah_barang = jumlah;
    };

    public int getTotalHarga(String kode, int jumlah) {
        int total = 0;
        for (int i = 0; i < total_barang; i++) {
            if (kode.equals(kode_barang[i])) {
                total = harga_barang[i] * jumlah;
                kode_hasil = Arrays.copyOf(kode_hasil, kode_hasil.length + 1);
                kode_hasil[kode_hasil.length - 1] = kode;
                jumlah_hasil = Arrays.copyOf(jumlah_hasil, jumlah_hasil.length + 1);
                jumlah_hasil[jumlah_hasil.length - 1] = jumlah;
            }
        }
        return total;
    };
    
    public void print_data() {
        try{

            for (int i = 0; i < jumlah_barang; i++) {
                String nama_hasil;
                int harga_hasil;
    
                for (int j = 0; j < total_barang; j++) {
                    if (kode_hasil[i].equals(kode_barang[j])) {
                        nama_hasil = nama_barang[j];
                        harga_hasil = harga_barang[j];
                        System.out.format("%-10s%-10s%-14s%,-10d%-12s%,-10d\n", i + 1, kode_hasil[i], nama_hasil, harga_hasil, jumlah_hasil[i], harga_hasil * jumlah_hasil[i]);
                    } 
                }
    
            }
        } catch (Exception e) {
        }
    }
}
