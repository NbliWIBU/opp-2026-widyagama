class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String pesan) {
        super(pesan);
    }
}

class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void tarik(int jumlah) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            throw new SaldoTidakCukupException(
                "Saldo tidak cukup! Kurang " + (jumlah - saldo)
            );
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil!");
        }
    }
}

public class soal17dpk {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(50000);

        System.out.println("Saldo awal: " + tabungan.getSaldo());
        System.out.println("Tarik: 100000");

        try {
            tabungan.tarik(100000);
        } catch (SaldoTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo akhir: " + tabungan.getSaldo());
    }
}