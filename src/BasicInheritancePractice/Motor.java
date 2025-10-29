package BasicInheritancePractice;

public class Motor extends Kendaraan {
    private String jenisMotor;
    private boolean hadRemCakram;

    public Motor(String merk, String warna, int tahunProduksi, String jenisMotor) {
        super(merk, warna, tahunProduksi);
        this.jenisMotor = jenisMotor;
        this.hadRemCakram = true;
        System.out.println("Constructor BasicInheritancePractice.Motor dipanggil");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis BasicInheritancePractice.Motor: " + jenisMotor);
        System.out.println("Rem Cakram: " + (hadRemCakram ? "Ya" : "Tidak"));
    }

    @Override
    public void klakson() {
        System.out.println("Tiiin tiiin! (suara motor)");
    }

    public void lakukanWheely() {
        System.out.println(merk + " melakukan wheelie!");
    }
}
