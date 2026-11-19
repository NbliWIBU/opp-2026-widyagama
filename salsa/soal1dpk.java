public class Siswa  {
    String nama;
    String kelas;
}

public class soal1dpk {
    public static void main(String[] args) {
        Siswa s1 = new Siswa();
        s1.nama = "Budi";
        s1.kelas = "X DPK 1";
        
        System.out.println("Nama: " + s1.nama);
        System.out.println("Kelas: " + s1.kelas);
    }
}