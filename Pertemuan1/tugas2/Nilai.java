package tugas2;
public class Nilai {
    String NIM;
    String nama;
    float NilaiAbsen;
    float NilaiTugas;
    float NilaiUTS;
    float NilaiUAS;

    //membuat method untuk menghitung nilai akhir
    float Nilai(){
        float NilaiAkhir = (this.NilaiAbsen*10/100)+(this.NilaiTugas*20/100)+(this.NilaiUTS*30/100)+(this.NilaiUAS*40/100);
        return NilaiAkhir;
    }

    //membuat method untuk menampilkan data nilai
    void CetakNilai(){
        System.out.println();
        System.out.println("NIM                    : "+NIM);
        System.out.println("NAMA                   : "+nama);
        System.out.println("NIlai Absen (10%)      : "+NilaiAbsen);
        System.out.println("Nilai Tugas (20%)      : "+NilaiTugas);
        System.out.println("Nilai UTS (30%)        : "+NilaiUTS);
        System.out.println("Nilai UAS (40%)        : "+NilaiUAS);
        System.out.println("Nilai Akhir            : "+Nilai());
    }
}
