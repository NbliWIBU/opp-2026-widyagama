public class Soal1DPK {
    public static void main(String[] args) {
        // Membuat objek Murid
        Murid murid = new Murid();

        // Mengisi data murid
        murid.nama = "Budi";
        murid.kelas = "X DPK 1";

        // Menampilkan data murid
        System.out.println("Nama: " + murid.nama);
        System.out.println("Kelas: " + murid.kelas);
    }
}

public class Murid {
    String nama;
    String kelas;
}