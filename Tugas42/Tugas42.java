import java.util.Scanner;


/*
 *
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PB6K
 * NIM		: 10116568
 * 
 * Description : Penarikan Uang
 *
 */
public class Practice42 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Penarikan Uang");
        System.out.print("Masukan Saldo Awal\t\t: ");
        Tabungan tabungan = new Tabungan(s.nextInt());
        System.out.print("Jumlah Uang yang di ambil\t: ");      
        System.out.println("Saldo anda sekarang\t\t: " + tabungan.ambilUang(s.nextInt()));                              
    }
    
}