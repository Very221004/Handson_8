package BasicInheritancePractice;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(String merk, String warna, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merk, warna, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
        System.out.println("Constructor BasicInheritancePractice.Mobil dipanggil");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Bahan Bakar: " + jenisBahanBakar);
    }

    public void nyalakanAC() {
        System.out.println("AC menyala");
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }
}
