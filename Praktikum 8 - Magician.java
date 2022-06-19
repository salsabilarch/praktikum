/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum8;

//Nama Praktikan : Salsabila Rachma Aurellia 215150707111034
//Kelas Praktikan : Teknologi Informasi E
/**
 *
 * @author Caca
 */

public class Magician extends Character {
    public Magician() {
        setHP(100);
        setAttack(60);
        setDefense(10);
    }
    public boolean attack() {
        int randomRandom = (int)
                (Math.random() * 100) + 1;
        if (randomRandom <= 35) {
            return true;
        }else {
            return false;
        }
    }
    public void info() {
        super.info();
        System.out.println("Role\t= Magician");
        System.out.println("HP\t= " + getHP());
        System.out.println("Attack\t= " + getAttack());
        System.out.println("Defense\t=" + getDefense());
    }
}