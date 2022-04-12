/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak4;

import java.util.Scanner;

//Salsabila Rachma Aurellia 215150707111034
/**
 *
 * @author Caca
 */
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();

        System.out.println();
        System.out.println("==== Cari Merchant ====");
        System.out.print("Masukkan Nama Merchant : ");
        String namaMerchant = scan.nextLine();
        System.out.print("Masukkan Nama Produk : ");
        String namaProduk = scan.nextLine();
        System.out.print("Masukkan Harga Produk : ");
        double harga = scan.nextDouble();
        scan.nextLine();
        System.out.println();
       
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(namaProduk, namaMerchant, harga));
        System.out.println("==== Menampilkan Data Merchant Terbaru ====");
        System.out.println();
        DataMerchant.tampilData();

    }
}