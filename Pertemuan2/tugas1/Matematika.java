package tugas1;

public class Matematika {

    // method pertambahan
    void pertambahan(int a, int b) {
        int c = a + b;
        System.out.println("Hasil pertambahan " + a + " + " + b + " = " + c);
    }

    // method pengurangan
    void pengurangan(int a, int b) {
        int c = a - b;
        System.out.println("Hasil pengurangan " + a + " - " + b + " = " + c);
    }

    // method perkalian
    void perkalian(int a, int b) {
        int c = a * b;
        System.out.println("Hasil perkalian " + a + " * " + b + " = " + c);
    }

    // method pembagian
    void pembagian(float a, float b) {
        float c = a / b;
        System.out.println("Hasil pembagian " + a + " / " + b + " = " + c);
    }
}