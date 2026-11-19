public class nama {
    public static void main(string[] args) {
       Scanner input =new Scanner(System.in);
      
        System.out.printIn("masukan nama kamu = ");
        string nama = input.nextline();

        System.out.printIn("masukan kelas kamu = ");
        String kelas = input.nextLine();

        System.out.printIn("----------------------------------------");

        System.out.printIn("Nama :" + nama);
        System.out.printIn("kelas :" + kelas);
       
        System.out.printIn("-----------------------------------------");
        
        input.close();
     }
}