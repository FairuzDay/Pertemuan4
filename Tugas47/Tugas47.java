import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PB6K
 * NIM		: 10116568
 * 
 * Description : Quiz
 *
 */
public class Practice47 {

    public static void main(String[] args) {       
        Scanner scannerNumber = new Scanner(System.in);
        Nilai nilai = new Nilai();
        System.out.print("Quiz\t\t= ");nilai.setQuiz(scannerNumber.nextDouble());
        System.out.print("UTS\t\t= ");nilai.setUts(scannerNumber.nextDouble());
        System.out.print("UAS\t\t= ");nilai.setUas(scannerNumber.nextDouble());
        
        System.out.println("");
        System.out.println("Nilai Akhir\t= " + nilai.getNilaiAkhir());
        System.out.println("Index\t\t= " + nilai.tentukanIndex(nilai.getNilaiAkhir()));
        System.out.println("Keterangan\t= " + nilai.tentukanKeterangan(nilai.getIndex()));
                              
    }
    
}