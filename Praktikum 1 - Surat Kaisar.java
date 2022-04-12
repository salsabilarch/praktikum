import java.io.*;
import java.util.*;

public class Solution {
    //Salsabila Rachma Aurellia_215150707111034

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         
        Scanner up = new Scanner(System.in);
    String normaltext = up.nextLine();
    
    int geser = up.nextInt();
    String random = "";
    char alfabet;
    for(int c=0; c < normaltext.length(); c++)
    {
        alfabet = normaltext.charAt(c);
        if(alfabet >= 'a' && alfabet <= 'z') 
        {
            alfabet = (char) (alfabet + geser);
            if(alfabet > 'z') {
                alfabet = (char) (alfabet+'a'-'z'-1);    
            }
            random = random + alfabet;
            
        }
        else if(alfabet >= 'A' && alfabet <= 'Z') {
            alfabet = (char) (alfabet + geser);
            if(alfabet > 'Z') {
                alfabet = (char) (alfabet+'A'-'Z'-1); }
            random = random + alfabet;
            
        }
        else {
            random = random + alfabet;
            
        }
    }
    System.out.println(random);
    }
}