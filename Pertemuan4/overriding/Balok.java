package overriding;
/**
 * Balok
 */

public class Balok extends Kubus {
    int lebar;
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang);
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // override method volume dan luasPermukaan
    @Override
    public void volume() {
        int volume = panjang * lebar * tinggi;
        System.out.println("Volume Balok = " + volume);
    }

    @Override
    public void luasPermukaan() {
        int luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        System.out.println("Luas Permukaan Balok = " + luasPermukaan);
    }
}