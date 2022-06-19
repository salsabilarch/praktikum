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
public class CarRider {
    private String nama;
    private int umur;
    private String noHP;
    public CarRider(String nama, int umur, String noHP){
        this.nama = nama;
        this.umur = umur;
        this.noHP = noHP;
    }public String getNama(){
        return nama;
    }public int getUmur(){
        return umur;
    }public String getNoHP(){
        return noHP;
    }
}
