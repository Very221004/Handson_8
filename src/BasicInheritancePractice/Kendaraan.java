package BasicInheritancePractice;

import java.time.Year;

public class Kendaraan {
    protected String merk;
    protected String warna;
    protected int tahunProduksi;
    private String nomorRangka;

    public Kendaraan(String merk, String warna, int tahunProduksi) {
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.nomorRangka = generateNomorRangka();
        System.out.println("Constructor BasicInheritancePractice.Kendaraan dipanggil");
    }

    private String generateNomorRangka() {
        return merk.substring(0, 3).toUpperCase() + tahunProduksi + "001";
    }

    public void displayInfo() {
        System.out.println("=== Info BasicInheritancePractice.Kendaraan ===");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public void klakson() {
        System.out.println("Tin tin!");
    }

    public int hitungUmur() {
        int tahunSekarang = Year.now().getValue();
        return tahunSekarang - tahunProduksi;
    }

    public String getNomorRangka() {
        return nomorRangka;
    }

    public void setNomorRangka(String nomorRangka) {
        this.nomorRangka = nomorRangka;
    }
}
