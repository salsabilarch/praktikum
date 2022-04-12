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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Erigo store = new Erigo();
        System.out.println("--------------------------------------");
        System.out.println("|            -ERIGO STORE-           |");
        System.out.println("--------------------------------------");
        System.out.println("| Erigo kode A    : Rp100.000        |");
        System.out.println("| Erigo kode B    : Rp125.000        |");
        System.out.println("| Erigo kode C    : Rp175.000        |");
        System.out.println("--------------------------------------");
        System.out.print("| Kode Barang :                      |");
        System.out.println("--------------------------------------");
        String model = scan.nextLine();
        
            if (model.equalsIgnoreCase("A")){
               store.ErigoA();
            }else if (model.equalsIgnoreCase("B")){
                store.ErigoB();
            }else if (model.equalsIgnoreCase("C")){
                store.ErigoC();
            }
    }
}