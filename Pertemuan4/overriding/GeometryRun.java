package overriding;
public class GeometryRun {
    public static void main(String[] args) {
        
        // objek dari class Balok dan Kubus, lalu memanggil method
        Balok b = new Balok(9, 2, 5);
        b.volume();
        b.luasPermukaan();

        Kubus k = new Kubus(5);
        k.volume();
        k.luasPermukaan();

        Balok b2 = new Balok(3, 10, 7);
        b2.volume();
        b2.luasPermukaan();
    }
}

