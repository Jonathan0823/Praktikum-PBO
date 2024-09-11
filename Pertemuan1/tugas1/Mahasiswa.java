package tugas1;
public class Mahasiswa {
    String nama;

    //membuat method untuk menampilkan status membaca
    void membaca(){
        System.out.println(nama + " sedang membaca");
    }

    //membuat method untuk menampilkan status menyontek
    void nyontek(){
        System.out.println(nama + " sedang nyontek");
    }
    
    //membuat method untuk menampilkan status memodifikasi
    void modifikasi(){
        System.out.println(nama + " sedang memodifikasi");
    }

}
