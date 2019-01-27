import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PB6K
 * NIM		: 10116568
 * 
 * Description : Printer
 *
 */
public class Practice45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        
        Printer printer = new Printer();
        System.out.print("Masukan nama anda\t\t: ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali?\t: ");
        printer.setJmlCetak(scannerNumber.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
                
    }
    
}