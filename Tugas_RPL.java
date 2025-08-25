package Tugas_RPL;

import java.util.Scanner;

public class Tugas_RPL {


    public static void main(String[] args) {
        
      
        Scanner input= new Scanner (System.in);
    System.out.println("masukan nilai anda =");
    
    int nilai;
    
    nilai=input.nextInt ();
    if (nilai >=90 && nilai <=100){
        System.out.println("A");
    }
    else if (nilai >= 80 && nilai <=89){
        System.out.println("B");
    }
    else if (nilai >= 70 && nilai <=79){
        System.out.println("C");
    }
    else if (nilai >=60 && nilai <=69){
        System.out.println("D");
    }
    else if (nilai >=50 && nilai <=59){
        System.out.println ("E");
    }
    else
        System.out.println("nilai tidak terdaftar");
    }
    
}
