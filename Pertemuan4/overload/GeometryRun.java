package overload;

public class GeometryRun {
    public static void main(String[] args) {

        // objek dari class Geometry, lalu memanggil method
        Geometry g = new Geometry();
        g.volume(5);
        g.luasPermukaan(9);
        g.volume(6,7,8);
        g.luasPermukaan(3, 10, 7);
    }
}
