package tugas2;

public class DemoKonversiSuku {
    public static void main(String[] args) {
        // Membuat objek suhu dari class KonversiSuhu2
        KonversiSuhu2 suhu2 = new KonversiSuhu2();

        // Memanggil method dari class KonversiSuhu2, kita bisa memanggil method yang ada di class KonversiSuhu karena inheritance
        suhu2.fahrenheitToReamur(90);
        suhu2.celciusToFahrenheit(50);
        suhu2.celciusToReamur(50);
    }
}
