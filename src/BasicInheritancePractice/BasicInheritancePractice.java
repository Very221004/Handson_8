package BasicInheritancePractice;

public class BasicInheritancePractice {
    public static void main(String[] args) {
        System.out.println("=== INHERITANCE DASAR ===");
        Mobil mobil = new Mobil("Toyota", "Hitam", 2022, 4, "Bensin");
        mobil.displayInfo();
        mobil.nyalakanAC();

        Motor motor = new Motor("Honda", "Merah", 2023, "Sport");
        motor.displayInfo();
        motor.klakson();
        motor.lakukanWheely();

        System.out.println("\n=== PENGGUNAAN SUPER ===");
        Truk truk = new Truk("Mitsubishi", "Putih", 2021, 5.0, 6);
        truk.displayInfo();
        truk.klakson();

        System.out.println("\n=== MULTILEVEL INHERITANCE ===");
        MobilSport mobilSport = new MobilSport("Ferrari", "Merah", 2024, 2, "Bensin", true, 320);
        mobilSport.displayInfo();
        mobilSport.aktifkanTurbo();

        System.out.println("\n=== TESTING INHERITANCE ===");
        System.out.println("mobilSport instanceof BasicInheritancePractice.MobilSport: " + (mobilSport instanceof MobilSport));
        System.out.println("mobilSport instanceof BasicInheritancePractice.Mobil: " + (mobilSport instanceof Mobil));
        System.out.println("mobilSport instanceof BasicInheritancePractice.Kendaraan: " + (mobilSport instanceof Kendaraan));
        System.out.println("mobilSport instanceof Object: " + (mobilSport instanceof Object));

        System.out.println("\nProtected property (merk): " + mobilSport.merk);
        System.out.println("Private property via getter (nomorRangka): " + mobilSport.getNomorRangka());
    }
}
