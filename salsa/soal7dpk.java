class Rekening {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        if (jumlah < 0) {
            System.out.println("Error: Saldo tidak boleh negatif!");
        } else {
            saldo = jumlah;
        }
    }
}

public class soal7dpk {
    public static void main(String[] args) {
        Rekening rekening = new Rekening();

        rekening.setSaldo(100000);
        System.out.println("Saldo: " + rekening.getSaldo());

        rekening.setSaldo(-50000);
        System.out.println("Saldo setelah perubahan: " + rekening.getSaldo());
    }
}