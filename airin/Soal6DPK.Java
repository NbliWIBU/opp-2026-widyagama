public class Soal6DPK {
    public static void main(String[] args) {
        Rekening r = new Rekening ();
	r . setSaldo(50000);
	System.out.println("Saldo: " + r.getSaldo());
    }
}

public class Rekening {
    private int saldo;  // disembunyikan
    
    public int getSaldo() {
        return saldo;
    }
    
    public void setSaldo(int jumlah) {
        this.saldo = jumlah;
    }
}