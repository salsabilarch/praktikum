/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pemlan2;

import java.util.Scanner;

//Salsabila Rachma Aurellia 215150707111034
/**
 *
 * @author Caca
 */

public class Main {
    Scanner scan = new Scanner(System.in);
    String model;
    int harga;
    int jumlah;
    int diskon;
    
    public void Erigo (String modelbaju, int hargabaju, int total){
        harga = hargabaju;
        model = modelbaju;
        jumlah = total;
    }
    final int normalA = 100000;
    final int normalB = 125000;
    final int normalC = 175000;
    
    public String getModel(){
        return model;
    }
    public double getJumlah(){
        return jumlah;
    }
    public double getHarga(){
        return harga;
    }
    
    void setModel(String modelbaju){
        this.model = modelbaju;
    }
    void setJumlah (int total){
        this.jumlah = total;
}
    
    void ErigoA(){
        System.out.print("Banyak barang : ");
        jumlah = scan.nextInt();
        
        if(jumlah > 100){
            diskon = normalA-5000;
            harga = jumlah*diskon;
            System.out.println("Kode            : Erigo A");
            System.out.println("Harga Satuan    : " +diskon);
            System.out.println("Total           : " +harga);
        }
        else{
            harga = jumlah*normalA;
            System.out.println("Kode            : Erigo A");
            System.out.println("Harga Satuan    : " +normalA);
            System.out.println("Total           : " +harga);
        }
    }
    
    void ErigoB(){
        System.out.print("Banyak barang : ");
        jumlah = scan.nextInt();
        
        if(jumlah > 100){
            diskon = normalB-5000;
            harga = jumlah*diskon;
            System.out.println("Kode            : Erigo B");
            System.out.println("Harga Satuan    : " +diskon);
            System.out.println("Total           : " +harga);
        }
        else{
            harga = jumlah*normalB;
            System.out.println("Kode            : Erigo B");
            System.out.println("Harga Satuan    : " +normalB);
            System.out.println("Total           : " +harga);
        }
    }
    void ErigoC(){
        System.out.print("Banyak barang : ");
        jumlah = scan.nextInt();
        
        if(jumlah > 100){
            diskon = normalC-15000;
            harga = jumlah*diskon;
            System.out.println("Kode            : Erigo C");
            System.out.println("Harga Satuan    : " +diskon);
            System.out.println("Total           : " +harga);
        }
        else{
            harga = jumlah*normalC;
            System.out.println("Kode            : Erigo C");
            System.out.println("Harga Satuan    : " +normalC);
            System.out.println("Total           : " +harga);
        }
    
}
}
