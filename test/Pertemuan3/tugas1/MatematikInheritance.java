package tugas1;

public class MatematikInheritance {
    public static void main(String[] args) {

        // Membuat objek mtk dari class Matematika2
        Matematika2 mtk = new Matematika2();

        // Memanggil method dari class Matematika2, kita bisa memanggil method yang ada di class Matematika karena inheritance
        mtk.pertambahan(20, 10);
        mtk.pengurangan(10, 5);
        mtk.perkalian(10, 3);
        mtk.pembagian(21, 2);
        mtk.modulus(21, 2);
    }
}