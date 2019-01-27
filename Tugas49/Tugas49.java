/*
 *
 * @author
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PB6K
 * NIM		: 10116568
 * 
 * Description : Beli Emas
 *
 */
public class Practice49 {

    public static void main(String[] args) {       
        BeliEmas be = new BeliEmas();
        be.setBeratEmas(15.7);
        be.setHargaSatuGram(570000);
        
        
        System.out.println("Total harga pembelian emas\t: "+be.hitungTotalPembayaran(be.getHargaSatuGram(), be.getBeratEmas()));       
    }
    
}