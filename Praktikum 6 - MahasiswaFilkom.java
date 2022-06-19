/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

//Nama Praktikan : Salsabila Rachma Aurellia 215150707111034
//Kelas Praktikan : Teknologi Informasi E
/**
 *
 * @author Caca
 */
public class MahasiswaFilkom extends Manusia{
    
    private String NIM;
    private double IPK;
    static int jumlahmahasiswa = 0;
    
    public String getNIM(){
        return NIM;
    }public double getIPK(){
        return IPK;
    }public void setNIM(String NIM){
        this.NIM = NIM;
    }public void setIPK(double IPK){
        this.IPK = IPK;
    }public MahasiswaFilkom(String NIM, double IPK, String Nama, String NIK, boolean Jeniskelamin, boolean Statuskawin) {
        super(Nama, NIK, Jeniskelamin, Statuskawin);
        this.NIM = NIM;
        this.IPK = IPK;
    }public String getStatus(){
        String angkatan = "";
        String prodi = "";
        angkatan = "20" + NIM.substring(0, 2);
        
        switch (NIM.substring(6,7)){
            case "2" :
                prodi = "Teknik Meniup Gelembung";
            break;
            
            case "3" :
                prodi = "Teknik Berburu Ubur Ubur";
            break;
 
            case "4" :
                prodi = "Sistem Perhamburgeran";
            break;
 
            case "6" :
                prodi = "Pendidikan Chum Bucket";
            break;
 
            case "7" :
                prodi = "Teknologi Telepon Kerang";
            break;
        }return prodi +", " +angkatan;
    }
    public double getBeasiswa(){
        double beasiswa;
        if (IPK >= 3.0 && IPK <= 3.5) {
            beasiswa = 50;
        }else if (IPK > 3.5 && IPK <= 4) {
            beasiswa = 75;
        }else {
            beasiswa = 0;
        }return beasiswa;
    }
    
    public void totalmahasiswa(){
        System.out.println(jumlahmahasiswa);
    }
 
    @Override
    public String toString() {
        System.out.println("Nama : " + this.getNama());
        System.out.println("NIK : " + this.getNIK());
        System.out.println("Jenis Kelamin : " + (this.getJeniskelamin() ? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan : " + "$" + (this.getBeasiswa() + this.getTunjangan()));
        System.out.println("NIM : " + this.getNIM());
        System.out.println("IPK : " + this.getIPK());
        System.out.println("Status : " + this.getStatus());
        return "";
    }
    
}