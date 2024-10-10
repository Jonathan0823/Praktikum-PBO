package tugas1.b;

public class GanjilGenap {
    int angka;

    // Constructor
    public GanjilGenap(int a){
        this.angka = a;
    }


    // Method untuk menampilkan angka ganjil
    public void ganjilFor(){
        System.out.println("Ganjil");
        for (int i = 1; i <= angka; i++) {
            if (i%2==1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    // Method untuk menampilkan angka genap
    public void genapFor(){
        System.out.println("Genap");
        for (int i = 1; i <= angka; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void ganjilWhile(){
        System.out.println("Ganjil");
        int i = 1;
        while (i <= angka) {
            if (i%2==1){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public void genapWhile(){
        System.out.println("Genap");
        int i = 1;
        while (i <= angka) {
            if (i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public void ganjilDoWhile(){
        System.out.println("Ganjil");
        int i = 1;
        do {
            if (i%2==1){
                System.out.print(i + " ");
            }
            i++;
        } while (i <= angka);
        System.out.println();
    }

    public void genapDoWhile(){
        System.out.println("Genap");
        int i = 1;
        do {
            if (i%2==0){
                System.out.print(i + " ");
            }
            i++;
        } while (i <= angka);
        System.out.println();
    }   
}
