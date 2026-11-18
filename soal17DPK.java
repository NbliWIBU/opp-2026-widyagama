class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String message) {
        super(message);
    }
}

class Tabungan {
    private int saldo;

    public Tabungan(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void tarik(int jumlah) throws SaldoTidakCukupException {
        if (jumlah > saldo) {
            int kurang = jumlah - saldo;
            throw new SaldoTidakCukupException("Saldo tidak cukup! Kurang " + kurang);
        } else {
            saldo -= jumlah;
        }
    }
}

public class soal17DPK {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(50000);
        System.out.println("Saldo awal: " + tabungan.getSaldo());
        
        int tarik = 100000;
        System.out.println("Tarik: " + tarik);
        
        try {
            tabungan.tarik(tarik);
            System.out.println("Penarikan berhasil.");
        } catch (SaldoTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Saldo akhir: " + tabungan.getSaldo());
    }
}

//Pertanyaan Bomus
//Kita perlu membuat custom exception agar pesan error yang dihasilkan lebih spesifik dan sesuai dengan konteks bisnis aplikasi (misal: "Saldo tidak cukup! Kurang X"). Kalau pakai Exception biasa, pesannya terlalu umum dan kita tidak bisa membedakan secara spesifik error apa yang sedang terjadi dalam alur logika program kita.
