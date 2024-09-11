package tugas1;

/**
 * Matematika2
 */

 // Melakukan inheritance dari class Matematika
 public class Matematika2 extends Matematika {

    // Membuat method baru yaitu modulus
    void modulus(int a, int b) {
        int c = a % b;
        System.out.println("Hasil modulus " + a + " % " + b + " = " + c);
    }
}