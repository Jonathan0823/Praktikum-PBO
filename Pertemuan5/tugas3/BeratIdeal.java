package tugas3;

public class BeratIdeal {
    // membuat variabel
    float berat;
    float tinggicm;
    float tinggi;
    float BMI;

    // membuat constructor
    public BeratIdeal(float berat, float tinggi) {
        this.berat = berat;
        this.tinggicm = tinggi;
    }
    
    // membuat method
    public void showbmi() {
        this.tinggi = this.tinggicm / 100;
        this.BMI = this.berat / (this.tinggi * this.tinggi);
        if(this.BMI >= 40){
            System.out.println("\nNilai BMI Anda adalah : " + this.BMI + "\nSangat Gemuk");
        } else if (this.BMI >= 30) {
            System.out.println("\nNIlai BMI Anda adalah : " + this.BMI + "\nGemuk");
        } else if (this.BMI >= 25) {
            System.out.println("\nNilai BMI Anda adalah : " + this.BMI + "\nBerat Badan lebih");
        } else if (this.BMI >= 18.5) {
            System.out.println("\nNilai BMI Anda adalah : " + this.BMI + "\nBerat Badan ideal");
        } else {
            System.out.println("\nNilai BMI Anda adalah : " + this.BMI + "\nBerat Badan Kurang");
        }
    }

}
