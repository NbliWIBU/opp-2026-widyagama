public class soal17 {
    public static void main(String[] args) {

        Tabungan tabunganSaya = new Tabungan(50000);
        System.out.println("Saldo awal: " + tabunganSaya.getSaldo());

        int jumlahTarik = 100000;
        System.out.println("Tarik: " + jumlahTarik);

        try {

            tabunganSaya.tarik(jumlahTarik);

            System.out.println("Penarikan berhasil!");

        } catch (SaldoTidakCukupException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo akhir: " + tabunganSaya.getSaldo());
    }
}

class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String pesan) {
        super(pesan); 
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
          
            int kekurangan = jumlah - saldo;
            
            
            throw new SaldoTidakCukupException("Saldo tidak cukup! Kurang " + kekurangan);
        } else {
            
            saldo -= jumlah;
        }
    }
}


