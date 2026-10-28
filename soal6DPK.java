class Rekening {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        saldo = jumlah;
    }
}

public class soal6DPK {
    public static void main(String[] args) {
        Rekening r = new Rekening();
        r.setSaldo(50000);
        System.out.println("Saldo: " + r.getSaldo());
    }
}