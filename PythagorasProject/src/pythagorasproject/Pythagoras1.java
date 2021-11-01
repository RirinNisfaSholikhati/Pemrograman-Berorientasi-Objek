/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Pythagoras1 {
    int pilih;
    int a,b;
    double c;
     
    void pilih(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Cek Triple Pythagoras");
        System.out.println("2. Menentukan Sisi Miring Segitiga");
        System.out.println("3. Menentukan Sisi SIku-siku Segitiga");
        System.out.println("4. Exit");
        System.out.print("Masukkan nomor yang Anda pilih : ");
        pilih = input.nextInt();
        input.nextLine();
        
        switch(pilih){
            case 1:
                System.out.println("=====Mengecek Triple Pythagoras=====");
                System.out.println("Masukkan nilai sisi a : ");
                a = input.nextInt();
                System.out.println("Masukkan nilai sisi b : ");
                b = input.nextInt();
                System.out.println("Masukkan nilai sisi c (hipotenusa) : ");
                c = input.nextInt();
                input.nextLine();
                
                if (c == Math.sqrt(Math.pow(b,2) + Math.pow(a, 2))) {
                    System.out.println("Ketiga sisi tersebut merupakan triple pythagoras");
                }else{
                    System.out.println("Ketiga sisi tersebut bukan triple pythagoras");
                }
                break;
                
         case 2:
                System.out.println("=====Menentukan Sisi Miring Segitiga=====");
                System.out.print("Masukkan nilai sisi a : ");
                a = input.nextInt();
                input.nextLine();
                System.out.print("Masukkkan nilai sisi b : ");
                b = input.nextInt();
                input.nextLine();
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
                System.out.println("Sisi miringnya adalah : " + c);
                break;
                
            case 3:
                System.out.println("=====Menentukan Sisi Siku-Siku Segitiga=====");
                System.out.print("Masukkan nilai sisi a : ");
                a = input.nextInt();
                input.nextLine();
                System.out.print("Masukkkan nilai sisi c (hipotenusa) : ");
                c = input.nextInt();
                input.nextLine();
                b = (int) Math.sqrt(Math.pow(c, 2) - Math.pow(a,2));
                System.out.println("Sisi sikunya adalah : " + b);
                break;
            case 4:
                System.out.println("Exit.........");
                System.exit(0);
                break;
            default:
                System.out.println("Maaf, pilihan yang Anda masukkan tidak ditemukan");
        }
    }        
}
   