class Rekening {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Saldo tidak boleh negatif!");
        } else {
            saldo = jumlah;
            System.out.println("Saldo berhasil diubah menjadi " + saldo);
        }
    }
}

public class soal7DPK {
    public static void main(String[] args) {
        Rekening r = new Rekening();
        
        r.setSaldo(100000);
        r.setSaldo(-5000);
        
        System.out.println("Saldo akhir: " + r.getSaldo());
    }
}