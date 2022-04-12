import java.io.*;
import java.util.*;

public class Solution {
    //Salsabila Rachma Aurellia_215150707111034

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner up = new Scanner(System.in);
        
        int bil, urutanbil = 0, sisa;
        
        System.out.print("");
        bil = (int) up.nextDouble();
        
        int bilanganasli = bil;
        
        while (bil != 0) {
            sisa = bil % 10;
            urutanbil = urutanbil * 10 + sisa;
            bil /= 10;
        }
        if (bilanganasli == urutanbil) {
            System.out.println(bilanganasli + " adalah selde. ");
        }
        else {
            System.out.println(bilanganasli + " bukan selde. ");
        }
    }
}