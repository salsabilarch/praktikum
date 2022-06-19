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
public class manager extends Pekerja{
    
    private int lamakerja;
    static int jumlahmanager = 0;
 
    public manager(int lamakerja, int jamkerja, int harikerja, String NIP, String nama, String NIK, boolean jeniskelamin, boolean menikah) {
    super(jamkerja, harikerja, NIP, nama, NIK, jeniskelamin, menikah);
        this.lamakerja = lamakerja;
    }public int getLamakerja() {
        return lamakerja;
    }public void setLamakerja(int lamakerja) {
        this.lamakerja = lamakerja;
    }public double Bonusmanager(){
        return Bonus() * 0.35;
    }
    public void totalmanager(){
        System.out.println(jumlahmanager);
    }
 
    @Override
    public String toString() {
        jumlahmanager++;
    return "\nNama\t\t : "+ getNama() +"\nNIK\t\t : " + getNIK() +"\nJenisKelamin\t : " + (jeniskelamin?"LakiLaki" : "Perempuan") + "\nPendapatan\t : " + (getPendapatan()+Bonus()+Bonusmanager()+Gaji() + 15)+"$" +"\nBonus\t\t : " + (Bonus()+Bonusmanager())+"$" +"\nGaji\t\t : " + Gaji()+"$" + "\nStatus\t\t : " + getStatus() + "\nLama Kerja\t : " + getLamakerja() + " hari";
    }
}