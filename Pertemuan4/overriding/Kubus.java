package overriding;
public class Kubus{
    int panjang;

    // Constructor Kubus
    public Kubus(int panjang) {
        this.panjang = panjang;
    }

    // Method menghitung volume dan luas permukaan
    public void volume() {
        int volume = panjang * panjang * panjang;
        System.out.println("Volume Kubus = " + volume);
    }

    public void luasPermukaan() {
        int luasPermukaan = 6 * (panjang * panjang);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);
    }
}
