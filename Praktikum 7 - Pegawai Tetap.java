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
 
 public class Pegawaitetap extends Pegawai {    
    private double upah;
    
    public Pegawaitetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }public void setUpah(double upah) {
        this.upah = upah;
    }public double getUpah() {
        return upah;
    }
    @Override
    public double gaji() {
        return upah;
    }
    @Override
    public String toString() {
        return "Pegawai Tetap\t : " + getNama() + "\nNo. KTP \t : " + getNoKTP() + "\nUpah\t\t : " + getUpah() + "\nPendapatan\t : Rp." + (int) gaji();
    }
}