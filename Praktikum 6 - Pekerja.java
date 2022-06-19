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
public class Pekerja extends Manusia{
    
    private double gaji = 0;
    private double bonus;
    private int jamkerja;
    private int harikerja;
    private String NIP;
    static int jumlahpekerja = 0;
    
    public double getGaji(){
        gaji = getHarikerja() * getJamkerja() * 10;
        return gaji;
    }public double getBonus(){
        return bonus;
    }public int getJamkerja(){
        return harikerja;
    }public int getHarikerja(){
        return harikerja;
    }public String getNIP(){
        return NIP;
    }public void setGaji(double gaji){
        this.gaji = gaji;
    }public void setBonus(double bonus){
        this.bonus = bonus;
    }public void setJamkerja(int jamkerja){
        this.jamkerja = jamkerja;
        jamkerja = 7;
    }public void setHarikerja(int harikerja){
        this.harikerja = harikerja;
    }public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    public Pekerja(int jamkerja, int harikerja, String NIP, String nama, String NIK, boolean jeniskelamin, boolean menikah) {
    super(nama, NIK, jeniskelamin, menikah);
 
        this.gaji = gaji;
        this.bonus = bonus;
        this.jamkerja = jamkerja;
        this.harikerja = harikerja;
        this.NIP = NIP;
    }public double Gaji(){
        return (getHarikerja() * getJamkerja() * gaji);
    }public double Bonus(){
        double totalhari = 0;
        double harilembur = ((harikerja/7) * 5 + (harikerja % 7)) * (jamkerja - 7) * 5;
        double harilibur = (harikerja/7) * 2 * jamkerja *20;
        
            if(jamkerja <= 7){
                return harilibur;
            }else {
                return harilembur + harilibur;
            }
    }
 
    public String getStatus(){
        String Kantor = "";
        String Cabang;
        String Departemen = "";
 
        switch(NIP.substring(0,1)){
            case "1":
                Kantor = "Mondstadt";
            break;
 
            case "2":
                Kantor="Liyue";
            break;
 
            case "3":
                Kantor="Inazuma";
            break;
 
            case "4":
                Kantor="Sumeru";
            break;
 
            case "5":
                Kantor="Fontaine";
            break;

            case "6":
                Kantor="Natlan";
            break;
 
            case "7":
                Kantor="Snezhnaya";
            break;
        }
 
        Cabang = " cabang " + NIP.substring(2,3);
 
        switch(NIP.substring(6,7)){
            case "1":
                Departemen = "Pemasaran";
            break;

            case "2":
                Departemen = "Humas";
            break;
 
            case "3":
                Departemen = "Riset";
            break;
 
            case "4":
                Departemen = "Teknologi";
            break;
 
            case "5":
                Departemen = "Personalia";
            break;
 
            case "6":
                Departemen = "Akademik";
            break;
 
            case "7":
                Departemen = "Administrasi";
            break;
 
            case "8":
                Departemen = "Operasional";
            break;
 
            case "9":
                Departemen = "Pembangunan";
            break;
        }return Departemen + " , " + Kantor + " "+ Cabang ;
    }
     public void totalpekerja(){
        System.out.println(jumlahpekerja);
    }
    
    @Override
    public String toString() {
        jumlahpekerja++;
    return "\nNama\t\t : "+ getNama() +"\nNIK\t\t : " + getNIK() +"\nJenisKelamin\t : " + (jeniskelamin?"Laki-Laki":"Perempuan") + "\nPendapatan\t : " + (getPendapatan()+Gaji()+Bonus())+"$" +"\nBonus\t\t : " + Bonus() +"$" +"\nGaji\t\t : " + Gaji() + "$" + "\nStatus\t\t : " + getStatus();
    }

}