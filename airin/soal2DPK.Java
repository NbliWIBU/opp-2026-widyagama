public class soal2DPK {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        siswa1.nama = "budi";
        siswa1.kelas = "X DPK 1";
        siswa1.perkenalan();
    }
}


public class Siswa {
    String nama;
    String kelas;

    void perkenalan() {
        System.out.println("Halo, saya " + nama + " dari kelas " + kelas );
    }
}