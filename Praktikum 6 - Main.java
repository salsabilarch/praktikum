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
public class Main {
    
    public static void main(String[] args) {
        
    System.out.println("====== DAFTAR MANUSIA ======"); 
    Manusia manusia = new Manusia ("Wahyu", "216538392993",true,true);
    Manusia manusia1 = new Manusia ("Geri", "216283937929",true,true);
    Manusia manusia2 = new Manusia ("Miu", "216837292098",true,true);
    System.out.println(manusia.toString());
    System.out.println(manusia1.toString());
    System.out.println(manusia2.toString());
 
    System.out.println("====== DAFTAR MAHASISWA ======"); 
    MahasiswaFilkom mhsw = new MahasiswaFilkom ("205878799718",3.5,"Pretty","35028757997",false,true);
    MahasiswaFilkom mhsw1 = new MahasiswaFilkom ("195827976567",3.2,"Markidut","32076480280",true,false);
    MahasiswaFilkom mhsw2 = new MahasiswaFilkom ("215822787689",2.7,"Betty","31627827997",false,false);
    System.out.println(mhsw.toString());
    System.out.println(mhsw1.toString());
    System.out.println(mhsw2.toString());
 
    System.out.println("====== DAFTAR PEKERJA ======"); 
    Pekerja pekerja1 = new Pekerja (8,27,"195873839902","Markopet","31656528797",true,false);
    Pekerja pekerja2 = new Pekerja (7,30,"195328399798","Bima","33636282680",true,true);
    Pekerja pekerja3 = new Pekerja (9,29,"205778752242","Widya","31785390216",false,true);
    System.out.println(pekerja1.toString());
    System.out.println(pekerja2.toString());
    System.out.println(pekerja3.toString());
    
    System.out.println("====== DAFTAR MANAJER ======"); 
    Manajer manajer = new Manajer (1000,6,30,"40977140232","Graita","126",true,true);
    Manajer manajer1 = new Manajer (950,7,28,"40977140232","Mega","126",false,true);
    Manajer manajer2 = new Manajer (1100,9,29,"40977140232","Ida","126",false,false);
    System.out.println(manajer.toString());
    System.out.println(manajer1.toString());
    System.out.println(manajer2.toString());
 
    System.out.println("====== TOTAL YANG TERDAFTAR ======");
    System.out.print("\tManusia \t: " );
    System.out.print("\tMahasiswa \t: ");
    System.out.print("\tPekerja \t: ");
    System.out.print("\tManager \t: ");
    manusia.totalmanusia();
    mhsw.totalmahasiswa();
    pekerja1.totalpekerja();
    manajer.totalmanager();
    } 
}