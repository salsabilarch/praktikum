/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

//Nama Praktikan : Salsabila Rachma Aurellia 215150707111034
//Kelas Praktikan : Teknologi Informasi E
/**
 *
 * @author Caca
 */
 
 public class Pegawaiharian extends Pegawai{
    
    private double upahperjam;
    private int totaljam;
    
    public Pegawaiharian(String nama, String noKTP, double upahperjam, int totaljam) {
        super(nama, noKTP);
        this.upahperjam = upahperjam;
        this.totaljam = totaljam;
    }public double getUpahperjam() {
        return upahperjam;
    }public int getTotaljam() {
        return totaljam;
    }public void setUpahperjam(double upahperjam) {
        this.upahperjam = upahperjam;
    }public void setTotaljam(int totaljam) {
        this.totaljam = totaljam;
    }   
    @Override
    public double gaji() {
        if (this.totaljam <= 40) {
            return (getUpahperjam() * getTotaljam());
        }else {
            return ((getUpahperjam() * 40) + ((getTotaljam() - 40) * getUpahperjam() * 1.5));
        }
    }
    @Override
    public String toString() {
        return "Pegawai Harian\t : " + getNama() + "\nNo. KTP \t : " + getNoKTP() + "\nUpah/jam\t : " + getUpahperjam()+ "\nTotal Jam Kerja\t : " + getTotaljam() + "\nPendapatan\t : Rp." + (int) gaji();
    }
}