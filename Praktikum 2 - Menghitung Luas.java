import java.util.*; 
import java.io.*;
//Salsabila Rachma Aurellia_215150707111034

class Persegi
{   
    void getLuaspersegi(int sisi)
    {
        int hasil = sisi*sisi;
        System.out.print(hasil);
    }
}

class Segitiga
{
    void getLuassegitiga(int alas, int tinggi)
    {
        int hasil = (alas*tinggi)/2;
        System.out.print(hasil);
    }
}

class Lingkaran
{
    void getLuaslingkaran(int jarijari)
    {
        if(jarijari == 7){
            double hitungLuas = 22/7*jarijari*jarijari;
            int hasil = (int)hitungLuas;
            System.out.print((double)hasil);
        }
        else{
            double hitungLuas = 3.14*jarijari*jarijari;
            int hasil = (int)hitungLuas;
            System.out.print((double)hasil);
        }
        
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Persegi segi4 = new Persegi();
        Segitiga segi3 = new Segitiga();
        Lingkaran bulat1 = new Lingkaran();
        
        int sisi, alas, tinggi, jarijari;
        int menu = scan.nextInt();
        
        if(menu==1)
        {    
            sisi = scan.nextInt();
            segi4.getLuaspersegi(sisi);
            
        }
        else if(menu==2){
            alas = scan.nextInt();
            tinggi = scan.nextInt();
            
            segi3.getLuassegitiga(alas, tinggi);
            
        }
        else if(menu==3){
            jarijari = scan.nextInt();
            bulat1.getLuaslingkaran(jarijari);
        }
        else{
            System.out.print("Input yang anda masukan tidak sesuai");
        }
    }
}