/*
 *
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PB6K
 * NIM		: 10116568
 * 
 * Description : Hukum OHM
 *
 */
public class Practice44 {

    public static void main(String[] args) {
        Baterai b = new Baterai();
        b= new Baterai(3, 12);               
        System.out.println("Kuat Arus\t: " + b.getKuatArus());
        System.out.println("Hambatan\t: " + b.getHambatan());
        System.out.println("Hasil Tegangan\t: " + b.hitungTegangan());
    }
    
}