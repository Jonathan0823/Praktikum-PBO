package tugas1.a;

public class BilanganPrima {
int n;

// Constructor
public BilanganPrima(int n) {
    this.n = n;
}

// Method untuk mengecek bilangan prima
public void primaFor() {
    System.out.println("Bilangan prima dari 1 sampai " + n + " adalah : ");
    for (int i = 2; i <= n; i++) {
        boolean prima = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                prima = false;
                break;
            }
        }
        if (prima) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
}

// Method untuk mengecek bilangan bukan prima
public void notPrimaFor() {
    System.out.println("Bilangan bukan prima dari 1 sampai " + n + " adalah : ");
    for (int i = 2; i <= n; i++) {
        boolean prima = true;
        for (int j = 2; j < i; j++) {   
            if (i % j == 0) {
                prima = false;
                break;
            }
        }
        if (prima == false) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
    
}
}