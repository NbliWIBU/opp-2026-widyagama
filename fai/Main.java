class Siswa {
    String nama;
    String kelas;
}


public class Main {
    public static void main(String[] args) {
        
        Siswa murid = new Siswa();
        
        murid.nama = "Budi";
        murid.kelas = "X DPK 1";
        
        System.out.println("Nama: " + murid.nama);
        System.out.println("Kelas: " + murid.kelas);
    }
}