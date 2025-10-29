package MethodOverriding;

public class DosenProfessor extends Dosen {
    private String gelarProfesor;
    private int jumlahPenelitian;

    public DosenProfessor(String nip, String nama, String jurusan,
                          String mataKuliah, int pengalamanMengajar,
                          String gelarProfesor, int jumlahPenelitian) {
        super(nip, nama, jurusan, mataKuliah, pengalamanMengajar);
        this.gelarProfesor = gelarProfesor;
        this.jumlahPenelitian = jumlahPenelitian;
        System.out.println("MethodOverriding.DosenProfessor constructor called");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gelar: " + gelarProfesor);
        System.out.println("Jumlah Penelitian: " + jumlahPenelitian);
    }
}
