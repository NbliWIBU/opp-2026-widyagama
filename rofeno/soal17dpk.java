class SaldoTidakCukupException extends Exception {
	public SaldoTidakCukupException(String message) {
		super(message);
	}
}

class Tabungan {
	private double saldo;

	public Tabungan(double saldoAwal) {
		this.saldo = saldoAwal;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void tarik(double jumlah) throws SaldoTidakCukupException {
		if (jumlah > saldo) {
			double kekurangan = jumlah - saldo;
			throw new SaldoTidakCukupException("Saldo tidak cukup! Kurang " + (int)kekurangan);
		} else {
			saldo -= jumlah;
		}
	}
}

public class soal17dpk {
	public static void main(String[] args) {
		Tabungan tabungan = new Tabungan(50000);
		System.out.println("Saldo awal: " + (int)tabungan.getSaldo());

		double jumlahTarik = 100000;
		System.out.println("Tarik: " + (int)jumlahTarik);

		try {
			tabungan.tarik(jumlahTarik);
			System.out.println("Penarikan berhasil!");
		} catch (SaldoTidakCukupException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("Saldo akhir: " + (int)tabungan.getSaldo());
	}
}

/*
PERTANYAAN BONUS:
Kenapa kita perlu buat custom exception? Kenapa tidak pakai Exception biasa saja?

JAWABAN:
Kita perlu membuat custom exception agar pesan error yang dihasilkan lebih spesifik,
jelas, dan sesuai dengan konteks bisnis aplikasi kita (dalam hal ini, masalah saldo bank).
Jika hanya menggunakan Exception biasa, kita tidak bisa membedakan secara pasti jenis
error apa yang terjadi hanya dari tipe exception-nya. Dengan custom exception, kita bisa
menangkap error spesifik (misal: hanya error SaldoTidakCukup) tanpa harus menebak-nebak
isi pesan string, sehingga kode menjadi lebih aman, mudah dibaca, dan mudah di-maintain.
*/
