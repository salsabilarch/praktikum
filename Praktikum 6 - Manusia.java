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
public class Manusia {
    
    String nama;
    String NIK;
    boolean jeniskelamin; //laki-laki = trus || perempuan = false
    boolean statuskawin;
    double tunjangan;
    static int jumlahmanusia = 0;
    
    public String getNama(){
        return nama;
    }public String getNIK(){
        return NIK;
    }public boolean getJeniskelamin(){
        return jeniskelamin;
    }public boolean getStatuskawin(){
        return statuskawin;
    }public void setNama(String nama){
        this.nama = nama;
    }public void setNIK(String NIK){
        this.NIK = NIK;
    }public void setJeniskelamin(boolean jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }public void setStatuskawin(boolean statuskawin){
        this.statuskawin = statuskawin;
    }
    public Manusia(String nama, String NIK, boolean jeniskelamin, boolean statuskawin){
        this.nama = nama;
        this.NIK = NIK;
        this.jeniskelamin = jeniskelamin;
        this.statuskawin = statuskawin;
    }
    public double getTunjangan(){
        if(statuskawin == true && jeniskelamin == true){
            tunjangan = 25;
        }else if(statuskawin == true && jeniskelamin == false){
            tunjangan = 20;
        }else if(statuskawin == false){
            tunjangan = 15;
        }return tunjangan;
    }
    public double getPendapatan(){
        return getTunjangan();
    }
    public void totalmanusia(){
        System.out.println(jumlahmanusia);
 }
    
    @Override
    public String toString(){
        System.out.println("Nama            : " + getNama());
        System.out.println("NIK             : " + getNIK());
        System.out.println("Jenis Kelamin   : " + (jeniskelamin ? "Laki-Laki" : "Perempuan"));
        System.out.println("Pendapatan      : $" + getPendapatan());
        return "";
    }
}