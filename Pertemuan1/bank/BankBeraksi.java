package bank;

public class BankBeraksi {
    public static void main(String[] args) {

        //welcome message
        System.out.println("Selamat Datang di Bank ABC");
        
        //membuat objek Bank
        Bank uang = new Bank(100000);
        uang.getSaldo();

        //memanggil method untuk menyimpan dan mengambil uang lalu mengecek masing -masing saldo
        uang.simpanUang(500000);  
        uang.getSaldo();

        uang.ambilUang(150000);
        uang.getSaldo();
    }
}
