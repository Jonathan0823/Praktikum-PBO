package tugas1;
public class MahasiswaBeraksi {
    public static void main(String[] args){

        //membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Andi";
        mahasiswa.membaca();
        mahasiswa.nyontek();
        mahasiswa.modifikasi();

        //membuat objek mahasiswa
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Budi";
        mahasiswa2.membaca();
        mahasiswa2.nyontek();
        mahasiswa2.modifikasi();
    }
}
