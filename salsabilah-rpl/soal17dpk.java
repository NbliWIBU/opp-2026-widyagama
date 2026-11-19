class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String pesan) {
        super(pesan);
    }
}

class Tabungan {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void tarik(int jumlah) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            throw new SaldoTidakCukupException("Saldo tidak mencukupi!");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Tabungan t = new Tabungan();

        t.setSaldo(50000);

        try {
            t.tarik(100000);
        } catch (SaldoTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo saat ini: " + t.getSaldo());
    }
}