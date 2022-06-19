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
 
 public class Main {

    public static void main(String[] args) {
        Pegawai pegawai;
        pegawai = new Pegawai();
        System.out.println("---------------------------------------------------");
        pegawai = new Pegawaitetap("Salsabila Rachma", "350720778119069528002", 2500000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Pegawaitetap("Ersya Putri", "350720778119060528006", 2100000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Pegawaitetap("Fanny Anindiya", "350720778119060538001", 1950000);
        System.out.println(pegawai.toString());
                
        System.out.println("---------------------------------------------------");
        pegawai = new Pegawaiharian("Tabina Yasmin", "350720778119060528803", 290000, 40);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Pegawaiharian("Brilliana Fakhrikha", "350720778119160528008", 360000, 50);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Pegawaiharian("Levina Shaharani", "350720778119060528015", 320000, 45);
        System.out.println(pegawai.toString());
               
        System.out.println("---------------------------------------------------");
        pegawai = new Sales("Chaerul Anam", "350720778119060528007", 40, 77000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Dhega Rafid", "350720778119060528009", 65, 940000);
        System.out.println(pegawai.toString() + "\n");
        pegawai = new Sales("Galih Rahmansyah", "350720778119060528001", 55, 80000);
        System.out.println(pegawai.toString());
		
		System.out.println("---------------------------------------------------");
    }
}