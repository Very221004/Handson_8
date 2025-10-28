public class MethodOverridingPractice {
    public static void main(String[] args) {

        System.out.println("=== BASIC METHOD OVERRIDING ===");

        // Latihan 1: toString()
        Mahasiswa m1 = new Mahasiswa("2024001", "Budi", "Informatika", 3.75);
        System.out.println(m1); // otomatis panggil toString()

        // Latihan 2: equals()
        Mahasiswa m2 = new Mahasiswa("2024001", "Budi", "Informatika", 3.75);
        System.out.println("m1.equals(m2): " + m1.equals(m2));
        System.out.println("m1 == m2: " + (m1 == m2));

        System.out.println("\n=== OVERRIDING WITH SUPER ===");

        Dosen d1 = new Dosen("198901001", "Dr. Sarah", "Informatika", "PBO", 10);
        d1.displayInfo();

        System.out.println("\n=== CHAIN OF OVERRIDING ===");
        DosenProfessor dp = new DosenProfessor("197812345", "Prof. Andi", "Teknik Komputer",
                "AI", 15, "Profesor", 25);
        dp.displayInfo();

        System.out.println("\n=== COVARIANT RETURN TYPES ===");
        Dosen cloned = d1.clone();
        System.out.println("Clone berhasil dengan type yang lebih spesifik");
        System.out.println("original != clone : " + (d1 != cloned));
        System.out.println("original.equals(clone): " + d1.equals(cloned));

        System.out.println("\n=== ACCESS MODIFIER RULES ===");
        d1.methodProtected(); // sekarang public karena widening

        System.out.println("\n=== FINAL METHOD TEST ===");
        d1.calculateSalary();
    }
}
