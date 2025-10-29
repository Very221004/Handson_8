package BasicInheritancePractice;

public class MobilSport extends Mobil {
    private boolean turbo;
    private int kecepatanMaksimal;

    public MobilSport(String merk, String warna, int tahunProduksi,
                      int jumlahPintu, String jenisBahanBakar,
                      boolean turbo, int kecepatanMaksimal) {
        super(merk, warna, tahunProduksi, jumlahPintu, jenisBahanBakar);
        this.turbo = turbo;
        this.kecepatanMaksimal = kecepatanMaksimal;
        System.out.println("Constructor BasicInheritancePractice.MobilSport dipanggil");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Turbo: " + (turbo ? "Ya" : "Tidak"));
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal + " km/jam");
    }

    public void aktifkanTurbo() {
        System.out.println("TURBO DIAKTIFKAN! " + merk + " melaju dengan kecepatan maksimal!");
    }
}
