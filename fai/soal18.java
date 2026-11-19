import java.util.HashMap;
import java.util.Map;

public class soal18 {
    public static void main(String[] args) {
        
        HashMap<String, String> bukuTelepon = new HashMap<>();

       
        bukuTelepon.put("Andi", "081234567");
        bukuTelepon.put("Budi", "082345678");
        bukuTelepon.put("Cici", "083456789");

       
        System.out.println("=== DAFTAR KONTAK ===");
      
        for (Map.Entry<String, String> kontak : bukuTelepon.entrySet()) {
            System.out.println(kontak.getKey() + ": " + kontak.getValue());
        }
        System.out.println();
       
        String cariNama = "Budi";
        
        System.out.println("Cari \"" + cariNama + "\": " + bukuTelepon.get(cariNama));
        System.out.println(); 
        
        String hapusNama = "Cici";
        System.out.println("Menghapus \"" + hapusNama + "\"...");
        
        bukuTelepon.remove(hapusNama);
        System.out.println(); 

        
        System.out.println("Sisa kontak:");
        for (Map.Entry<String, String> kontak : bukuTelepon.entrySet()) {
            System.out.println(kontak.getKey() + ": " + kontak.getValue());
        }
    }
}