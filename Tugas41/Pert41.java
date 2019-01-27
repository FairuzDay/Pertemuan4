import java.util.Scanner;


/*
 *
 * @author
 * NAMA 	: Muh.Fairuz
 * KELAS	: PB6K
 * NIM		: 10116568
 * 
 * Description :Massa Jenis
 *
 */
public class Practice41 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Kubus kubus = new Kubus();
        
        
        System.out.println("=== Massa Jenis Kubus ===");
        System.out.print("Sisi \t: ");kubus.setSisi(s.nextInt());
        System.out.print("Massa \t: ");kubus.setMassa(s.nextInt());
        System.out.println("");
        
        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("Volume\t\t: " + kubus.hitungVolume());
        System.out.println("Massa Jenis\t: " + kubus.hitungMassa());
    }
    
}