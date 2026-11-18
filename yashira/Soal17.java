public class Soal17 {
    public static void main(String[] args) {
        Tabungan t = new Tabungan(50000);
        System.out.println("Saldo awal: " + t.getSaldo());

        try {
            System.out.println("Tarik: 100000");
            t.tarik(100000);
        } catch (SaldoTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo akhir: " + t.getSaldo());
    }
}

class SaldoTidakCukupException extends Exception {
    SaldoTidakCukupException(String pesan) {
        super(pesan);
    }
}

class Tabungan {
    private int saldo;

    Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    void tarik(int jumlah) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            throw new SaldoTidakCukupException("Saldo tidak cukup! Kurang " + (jumlah - saldo));
        }
        saldo -= jumlah;
    }
}