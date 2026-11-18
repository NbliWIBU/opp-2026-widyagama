public class soal2dpk {
    public static void main(String[] args) {
        Siswa s1 = new Siswa();
        s1.nama = "Budi";
        s1.kelas = "X DPK 1";

        s1.perkenalan();
    }
}

public class Siswa {
    String nama;
    String kelas;

    void perkenalan() {
        System.out.println("Halo, saya " + nama +
        " dari kelas " + kelas);
    }
}