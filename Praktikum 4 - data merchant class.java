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
 
public class DataMerchant {
    static Merchant[] merchant = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant[] merch = new Merchant[DataMerchant.merchant.length + 1];

        for (int x = 0; x < DataMerchant.merchant.length; x++) {
            merch[x] = merchant[x];
        }
        merch[DataMerchant.merchant.length] = merchant;
        return merch;
    }public static void tampilData() {
        for (Merchant merch : DataMerchant.merchant) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant  : "+merch.getNamaMerchant());
            System.out.println("Nama Produk    : "+merch.getNamaProduk());
            System.out.println("Harga          : "+(int)merch.getHargaMakanan());
        }
    }public static Merchant cariMerchant(String nama) {
        int index = 0;
        for (int x = 0; x < DataMerchant.merchant.length; x++) {
            if (DataMerchant.merchant[x].getNamaMerchant() == nama) {
                index = x;
                break;
            }
        } return merchant[index];
    }public static void tampilMerchant(Merchant merch) {
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant  : "+merch.getNamaMerchant());
        System.out.println("Nama Produk    : "+merch.getNamaProduk());
        System.out.println("Harga          : "+(int)merch.getHargaMakanan());
    }public static void updateMerchant(Merchant merch, String namaMerchant, String namaProduk, double harga) {
        merch.setNamaMerchant(namaMerchant);
        merch.setNamaProduk(namaProduk);
        merch.setHargaMakanan(harga);
    }
}