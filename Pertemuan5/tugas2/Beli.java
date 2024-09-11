package tugas2;

/**
 * Beli
 */
public class Beli {
    // membuat variabel
    int harga;
    int diskon;

    // membuat konstruktor
    public Beli(int harga) {
        this.harga = harga;
    }

    // membuat method
    void pembelian() {
        if (this.harga >= 50000) {
            this.diskon = this.harga * 1/5;
        } else {
            this.diskon = this.harga * 5/100;
        }
        System.out.println("Besarnya potongan Rp. " + (this.diskon));
        System.out.println("Jumlah yang harus dibayarkan = " + (this.harga - this.diskon));
    }
    
}