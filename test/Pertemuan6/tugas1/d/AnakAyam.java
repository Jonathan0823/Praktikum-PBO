package tugas1.d;

public class AnakAyam {
    int anakayam;

    // Constructor
    public AnakAyam(int n) {
        this.anakayam = n;
    }

    // Method untuk memulai lagu
    public void songstart() {

        //memastikan loop berjalan ketika jumlah anak ayam masih diatas 1
        while(anakayam > 1) {
            System.out.println();
            System.out.println("Tek kotek, kotek kotek");
            System.out.println("Anak ayam turunlah berkotek");
            System.out.println("Anak ayam turunlah "+anakayam);
            if(anakayam > 1){
                anakayam--;
                System.out.println("Mati satu tinggallah "+anakayam);
                System.out.println("Anak ayam turunlah "+anakayam);                
            }
            if(anakayam > 1){
                anakayam--;
                System.out.println("Mati satu tinggallah "+anakayam);
                System.out.println("Anak ayam turunlah "+anakayam);                
            }
        }

        //line ini akan tereksekusi ketika jumlah anak ayam sudah 0
        System.out.println("Mati satu tinggallah induknya");
    }
}
