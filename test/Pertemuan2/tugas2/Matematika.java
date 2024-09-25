package tugas2;

public class Matematika implements IMatematika {

    // method pertambahan
    public void pertambahan(int a, int b) {
        int c = a + b;
        System.out.println("Hasil pertambahan " + a + " + " + b + " = " + c);
    }

    // method pengurangan
    public void pengurangan(int a, int b) {
        int c = a - b;
        System.out.println("Hasil pengurangan " + a + " - " + b + " = " + c);
    }

    // method perkalian
    public void perkalian(int a, int b) {
        int c = a * b;
        System.out.println("Hasil perkalian " + a + " * " + b + " = " + c);
    }

    // method pembagian
    public void pembagian(float a, float b) {
        float c = a / b;
        System.out.println("Hasil pembagian " + a + " / " + b + " = " + c);
    }
}