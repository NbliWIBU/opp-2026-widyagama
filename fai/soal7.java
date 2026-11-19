public class soal7 {
    public static void main(String[] args) {
        Rekening r = new Rekening();

        r.setSaldo(100000); // sukses
        r.setSaldo(-5000); // ditolak

        System.out.println("Saldo akhir: " + r.getSaldo());
    }
}

class Rekening {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    // Update setter to reject negative numbers
    public void setSaldo(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Saldo tidak boleh negatif!");
        } else {
            this.saldo = jumlah;
            System.out.println("Saldo berhasil diubah menjadi " + jumlah);
        }
    }
}

