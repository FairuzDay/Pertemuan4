import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PB6K
 * NIM		: 10116568
 * 
 * Description : Artinya kamu
 *
 */
public class Practice46 {

    public static void main(String[] args) {       
        Scanner scannerNumber = new Scanner(System.in);
       
        Age a = new Age();
        DateFormat df = new SimpleDateFormat("yyyy");                    
        int yearNow = Integer.parseInt(df.format(new Date()));
        
        System.out.println("===== Hasil Perhitungan Umur =====");
        System.out.print("Tahun Lahir anda\t: ");a.setYearBirth(scannerNumber.nextInt());           
        System.out.println("Hari ini tahun\t\t: " + yearNow);a.setYearNow(yearNow);
        System.out.println("Umur kamu sampai hari ini adalah " + a.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + a.tandanyaKamu(a.hitungUmur()));
                              
    }
    
}