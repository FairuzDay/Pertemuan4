/*
 *
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PB6K
 * NIM		: 10116568
 * 
 * Description : Energi Kinetik
 *
 */
public class Practice50 {

    public static void main(String[] args) {       
        Bola b = new Bola();
        b.setMassa(145);
        b.setKecepatan(25);
        System.out.println("1 buah baseball dengan massa = " + b.getMassa() + " g");
        System.out.println("baseball dilempar dengan kecepatan = " + b.getKecepatan() + " m/s");                
        System.out.println("");
        System.out.println("A. Energi Kinetik = " + b.hitungEnergiKinetik1(b.getMassa(), b.getKecepatan()));
        System.out.println("B. Usaha pada bola = " + b.hitungUsaha());
    }
    
}