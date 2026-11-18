public class Soal17DPK {
    public static void main(String[] args) {
        Tabungan tab = new Tabungan(50000);

        System.out.println("Saldo awal: " + tab.getSaldo());
        System.out.println("Tarik: 100000");

        try {
            tab.tarik(100000);
        } catch (SaldoTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo akhir: " + tab.getSaldo());
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

    int getSaldo() {
        return saldo;
    }

    void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    void tarik(int jumlah) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            int kurang = jumlah - saldo;
            throw new SaldoTidakCukupException("Saldo tidak cukup! Kurang " + kurang);
        }
        saldo -= jumlah;
        System.out.println("Berhasil tarik: " + jumlah);
    }
}

