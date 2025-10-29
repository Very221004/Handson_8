package MethodOverriding;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String jurusan;

    public Pegawai(String nip, String nama, String jurusan) {
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        System.out.println("MethodOverriding.Pegawai constructor called");
    }

    public void displayInfo() {
        System.out.println("=== Info MethodOverriding.Pegawai ===");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    public Pegawai clone() {
        return new Pegawai(this.nip, this.nama, this.jurusan);
    }

    protected void methodProtected() {
        System.out.println("Protected method in MethodOverriding.Pegawai");
    }

    public final void calculateSalary() {
        System.out.println("Menghitung gaji pegawai...");
    }

    @Override
    public String toString() {
        return "MethodOverriding.Pegawai{nip='" + nip + "', nama='" + nama + "', jurusan='" + jurusan + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Pegawai p) {
            return this.nip.equals(p.nip);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return nip.hashCode();
    }
}
