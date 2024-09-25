package tugas2;

public class MatematikaBeraksi {
    public static void main(String[] args) {

        // Membuat objek mtk dari class Matematika
        Matematika mtk = new Matematika();

        // Memanggil method pada objek mtk
        mtk.pertambahan(20, 10);
        mtk.pengurangan(10, 5);
        mtk.perkalian(10, 3);
        mtk.pembagian(21, 2);
    }
}