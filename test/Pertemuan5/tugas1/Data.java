package tugas1;
public class Data {
    // Membuat variabel
    long NIM;
    String Nama;
    float NilaiKehadiran;
    float NilaiTugas;
    float NilaiUTS;
    float NilaiUAS;
    String Keterangan;

    // Menghitung Nilai Akhir
    float NilaiAkhir() {
        return (0.1f * NilaiKehadiran) + (0.2f * NilaiTugas) + (0.3f * NilaiUTS) + (0.4f * NilaiUAS);
    }

    // Menghitung Grade
    String Grade() {
        if (NilaiAkhir() >= 76) {
            Keterangan = "Istimewa";
            return "A";
        } else if (NilaiAkhir() >= 66) {
            Keterangan = "Baik";
            return "B";
        } else if (NilaiAkhir() >= 56) {
            Keterangan = "Cukup";
            return "C";
        } else if (NilaiAkhir() >= 46) {
            Keterangan = "Kurang";
            return "D";
        } else {
            Keterangan = "Kurang Sekali";
            return "E";
        }
    }

    // Menampilkan Nilai
    void display() {
        System.out.println("\nNPM Mahasiswa : " + NIM);
        System.out.println("Nama Mahasiswa : " + Nama);
        System.out.println("Nilai Rata-rata : " + NilaiAkhir());
        System.out.println("Grade : " + Grade());
        System.out.println("Keterangan : " + Keterangan);
    }

}
