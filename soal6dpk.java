public class soal6dpk {
    public static void main(String[] args) {
        Rekening rekening = new Rekening();

        rekening.setSaldo(1000000);

        System.out.println("Saldo rekening: Rp" + rekening.getSaldo());
    }
}

public class Rekening {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        saldo = jumlah;
    }
}

