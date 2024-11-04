package pertemuan9.PenentuJumlahHari;

public class HitungHari {
    String namaBulan;
    int tahun;
    public HitungHari(int tahun, String namaBulan) {
        this.tahun = tahun;
        this.namaBulan = namaBulan;
    }

    public String Hitung() {
        int jumlahHari = 0;
        switch (namaBulan) {
            case "Januari":
            case "Maret":
            case "Mei":
            case "Juli":
            case "Agustus":
            case "Oktober":
            case "Desember":
                jumlahHari = 31;
                break;
            case "April":
            case "Juni":
            case "September":
            case "November":
                jumlahHari = 30;
                break;
            case "Februari":
                if (tahun % 4 == 0) {
                    if (tahun % 100 == 0) {
                        if (tahun % 400 == 0) {
                            jumlahHari = 29;
                        } else {
                            jumlahHari = 28;
                        }
                    } else {
                        jumlahHari = 29;
                    }
                } else {
                    jumlahHari = 28;
                }
                break;
            default:
                System.out.println("Bulan tidak valid");
                break;
        }
        return "Jumlah hari pada bulan " + namaBulan + " tahun " + tahun + " adalah " + jumlahHari;
    }
}
