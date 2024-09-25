package overload;

public class Geometry {

    // Volume Kubus
    void volume(int sisi){
        System.out.println("Volume Kubus = " + sisi * sisi * sisi);
    }

    // Volume Balok
    void volume(int panjang, int lebar, int tinggi){
        System.out.println("Volume Balok = " + panjang * lebar * tinggi);
    }

    // Luas Permukaan Kubus
    void luasPermukaan(int sisi){
        System.out.println("Luas Permukaan Kubus = " + 6 * (sisi * sisi));
    }

    // Luas Permukaan Balok
    void luasPermukaan(int panjang, int lebar, int tinggi){
        System.out.println("Luas Permukaan Balok = " + 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi));
    }
}
