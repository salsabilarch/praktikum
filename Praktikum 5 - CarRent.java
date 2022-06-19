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
public class CarRent {
	
    private CarRider pengendara;
    private Car mobil;
    private int durasiRent;
    public CarRent(CarRider pengendara, Car mobil, int durasiRent){
        this.pengendara = pengendara;
        this.mobil = mobil;
        this.durasiRent = durasiRent;
    }public CarRider getPengendara(){
        return pengendara;
    }public Car getMobil(){
        return mobil;
    }public int getDurasiRent(){
        return durasiRent;
    }
}
