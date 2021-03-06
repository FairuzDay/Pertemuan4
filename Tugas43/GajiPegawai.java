/**
 *
 * @author Muh.Fairuz Hadi Day
 */
public class GajiPegawai {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;

    public void tampilData(String nama, String alamat, int uangTransport, int uangTunjangan, int gajiPokok, int totalGaji) {
        System.out.println("Nama Karyawan\t\t: " + nama);
        System.out.println("Alamat\t\t\t: " + alamat);
        System.out.println("Uang Transport\t\t: Rp." + uangTransport);
        System.out.println("Uang Tunjangan\t\t: Rp." + uangTunjangan);
        System.out.println("Gaji Pokok\t\t: Rp." + gajiPokok);
        System.out.println("TOTAL GAJI\t\t: Rp." + totalGaji);
    }
    
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }      
    
    
}