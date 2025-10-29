package MethodOverriding;

public class Dosen extends Pegawai {
    private String mataKuliah;
    private int pengalamanMengajar;

    public Dosen(String nip, String nama, String jurusan, String mataKuliah, int pengalamanMengajar) {
        super(nip, nama, jurusan);
        this.mataKuliah = mataKuliah;
        this.pengalamanMengajar = pengalamanMengajar;
        System.out.println("MethodOverriding.Dosen constructor called");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("Pengalaman: " + pengalamanMengajar + " tahun");
    }

    @Override
    public Dosen clone() {
        return new Dosen(this.nip, this.nama, this.jurusan, this.mataKuliah, this.pengalamanMengajar);
    }

    @Override
    public void methodProtected() {
        System.out.println("Widening access modifier: ALLOWED");
    }
}
