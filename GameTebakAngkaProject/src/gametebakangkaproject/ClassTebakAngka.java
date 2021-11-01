/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class ClassTebakAngka {
    int tebak;
      
    void tebakAngka(){
        int acak = (int) (Math.random() *100); 
        Scanner input = new Scanner(System.in);
        System.out.println("Hallo... nama saya Mrs.Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100.");
        System.out.println("Silakan Anda tebak ya !!!");
        System.out.println(" ");
        int i = 0;
        do{
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = input.nextInt();
            input.nextLine();
            if (tebak == acak){
                System.out.println("Hehehe... Bilangan tebakan Anda BENAR :)");
                break;
            }else if (tebak < acak){
                System.out.println("Hehehe... Bilangan tebakan Anda terlalu kecil");
            }else{
                System.out.println("Hehehe... Bilangan tebakan Anda terlalu besar");
            }
        i++;
        } while (i >=0);
        
    }
}
