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
public class CarData {
    
    private static ArrayList <Car> carList = new ArrayList<Car>();
    public void addCar(String tipeMobil, String plat, String merk){
        Car mobill = new Car(tipeMobil, plat, merk);
        carList.add(mobill);
    }
	public ArrayList <Car> getCarList(){
        return carList;
    }
    public void listOfCar(){
        System.out.println("============================================");
        System.out.println("   DAFTAR MOBIL                             ");
        System.out.println("============================================");
            for (Car data : carList){
                System.out.println("TIPE MOBIL      : " + data.getTipeMobil());
                System.out.println("NO. POLISI      : " + data.getPlat());
                System.out.println("MERK MOBIL      : " + data.getMerk());
                System.out.println("--------------------------------------------");
            }
    }
}
