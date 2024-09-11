package tugas2;

public class Tabel {
    int n;

    // Constructor
    public Tabel(int n) {
        this.n = n;
    }

    // Method untuk menampilkan tabel
    void showTable() {
    System.out.format("%4s", " ");

    // Menampilkan kolom
    for (int i = 1; i <= n; i++) {
        System.out.format("%4d", i);
    }
    System.out.println();

    // Menampilkan baris
    for (int i = 1; i <= n; i++) {
        System.out.format("%4d", i);

        // Menampilkan isi dari tiap kolom
        for (int j = 1; j <= n; j++) {
            System.out.format("%4d", i * j);
        }
        System.out.println();
    }
    
    }
}
