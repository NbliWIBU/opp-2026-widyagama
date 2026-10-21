class Siswa {
    
    String nama;
    String kelas;
}

public class soal1DPK {
   public static void main(String[] x) {
        Siswa siswa1 = new Siswa();
        siswa1.nama = "Budi";
        siswa1.kelas = "X DPK 1";

        System.out.println("Nama: " + siswa1.nama);
        System.out.println("Kelas: " + siswa1.kelas);
        }
}