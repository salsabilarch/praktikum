/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

//Nama : Salsabila Rachma Aurellia 215150707111034
/**
 *
 * @author Caca
 */
public class Car {
    
    private String tipeMobil;
    private String plat;
    private String merk;
    private boolean status;
    public Car(String tipeMobil, String plat, String merk, boolean status){
        this.tipeMobil = tipeMobil;
        this.plat = plat;
        this.merk = merk;
        this.status = status;
		
    }public Car(String tipeMobil, String plat, String merk){
        this.tipeMobil = tipeMobil;
        this.plat = plat;
        this.merk = merk;
    }public String getTipeMobil(){
        return tipeMobil;
    }public String getPlat(){
        return plat;
    }public String getMerk(){
        return merk;
    }public boolean isStatus(){
        return status;
    }public static void setStatus(String status){
        if(status == "true"){
            System.out.println("MOBIL BERHASIL DISEWA");      
    }else{
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }
	public static void status(){
        Car.setStatus("true");
        Car.setStatus("false");
        Car.setStatus("true");
        Car.setStatus("false");
 }
}
