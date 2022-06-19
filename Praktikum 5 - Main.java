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
public class Main {
	
    public static void main(String[] args) {
        
        CarRider pengendara1 = new CarRider ("Tiara Andini", 20, "081234567890");
        CarRider pengendara2 = new CarRider ("Mahalini Raharja", 22, "082233445566");
        CarRider pengendara3 = new CarRider ("Lyodra Ginting", 18, "0888994466753");
        CarRider pengendara4 = new CarRider ("Ziva Magnolya", 21, "088333355564");
       
        CarData data = new CarData();
        data.addCar("SPORT", "T 141 RA", "MERCEDES-AMG GT");
        data.addCar("MPV", "L 111 NI", "XPANDER");
        data.addCar("SEDAN", "L 717 LY", "HONDA CIVIC");
        data.addCar("SUV", "Z 111 VA", "TOYOTA");
        data.listOfCar();
        
        RentArchive rent = new RentArchive();
        rent.Rent(pengendara1, data.getCarList().get(1), 7);
        rent.Rent(pengendara2, data.getCarList().get(1), 8);
        rent.Rent(pengendara3, data.getCarList().get(0), 3);
        rent.Rent(pengendara4, data.getCarList().get(1), 6);
    
        System.out.println("");
        Car.status();
        System.out.println("");
        rent.info();
    }
    
}
