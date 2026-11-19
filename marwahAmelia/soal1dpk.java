public class Siswa {
    String nama;
    String kelas;

    void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
    }
}

public class soal1dpk {
    public static void main(String[] args) {
        Siswa s1 = new Siswa();
        s1.nama = "Budi";
        s1.kelas = "X DPK 1";

        s1.tampilkan();
    }
}