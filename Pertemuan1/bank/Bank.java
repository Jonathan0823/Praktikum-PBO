package bank;

public class Bank {
    //deklarasi variabel saldo
    int saldo;

    //konstruktor
    public Bank(int uang){
        this.saldo = uang;
    }

    //membuat method untuk menyimpan uang
    void simpanUang(int a){
        System.out.println("\nSimpan Uang:Rp. "+a);
        saldo = saldo + a;
    }
    
    //membuat method untuk mengambil uang
    void ambilUang(int a){
        System.out.println("\nAmbil Uang:Rp. "+a);
        saldo = saldo - a;
    }
    
    //membuat method untuk menampilkan saldo
    void getSaldo(){
        System.out.println("Saldo saat ini:Rp. "+saldo);
    }

}
