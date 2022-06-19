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

public class Healer extends Character {
    public Healer() {
        setHP(70);
        setAttack(10);
        setDefense(10);
    }
    public void heal() {
        setHP(getHP() + 25);
    }
    public boolean attack() {
        int randomRandom = (int)
                (Math.random() * 100) + 1;
        if (randomRandom <= 85) {
            return true;
        }else {
            return false;
        }
    }
    public void info() {
        super.info();
        System.out.println("Role\t= Healer");
        System.out.println("HP\t= " + getHP());
        System.out.println("Attack\t= " + getAttack());
        System.out.println("Defense\t= " + getDefense());
    }
}