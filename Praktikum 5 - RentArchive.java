/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.ArrayList;

//Nama : Salsabila Rachma Aurellia 215150707111034
/**
 *
 * @author Caca
 */

public class RentArchive {
    
    private static ArrayList <CarRent> datacarRent = new ArrayList<CarRent>();
    public void Rent(CarRider pengendara, Car mobil, int durasiRent){
        CarRent rental = new CarRent(pengendara, mobil, durasiRent);
        datacarRent.add(rental);
    }public void info(){
        System.out.println("============================================");
        System.out.println("   DATA PELANGGAN                           ");
        System.out.println("============================================");
            for (CarRent pelanggan : RentArchive.datacarRent){
                System.out.println("NAMA PEMINJAM   : " + pelanggan.getPengendara().getNama());
                System.out.println("TIPE MOBIL      : " + pelanggan.getMobil().getTipeMobil());
                System.out.println("NO. POLISI      : " + pelanggan.getMobil().getPlat());
                System.out.println("LAMA RENTAL     : " + pelanggan.getDurasiRent());
                System.out.println("--------------------------------------------");
            }
    }
}
