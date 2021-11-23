/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameproject;

import java.util.Scanner;
import java.time.*;

/**
 *
 * @author ASUS
 */
public class RentalConsoleGameProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member              : ");
        String id = input.nextLine();
        
        switch (id){
            case "M001":
                Member a = new Member();
                a.addMember(new DataMembership("M001","Mr.X","Silver"));
                
                SilverMember s = new SilverMember();
                s.input();
                
                a.tampilMember();
                
                s.hitungsewa();
                s.totalsewa(25000,0.01);
                s.hitungpoint(1);
                
                break;
                
            case "M002":
                Member b = new Member();
                b.addMember(new DataMembership("M002","Mr.Y","Gold"));
                                
                GoldMember gold = new GoldMember();
                gold.input();
                
                b.tampilMember();
                
                gold.hitungsewa();
                gold.totalsewa(30000,0.02);
                gold.hitungpoint(5);
                gold.bonuscash(5000);

                break;
            
            case "M003":
                Member c = new Member();
                c.addMember(new DataMembership("M003","Mr.Z","Platinum"));
                
                PlatinumMember platinum = new PlatinumMember();
                platinum.input();               
                
                c.tampilMember();
                
                platinum.hitungsewa();
                platinum.totalsewa(45000, 0.03);
                platinum.hitungpoint(10);
                platinum.bonuscash(10000);
                platinum.bonuspulsa(5000);
                  
                break;
                
        }
    }   
}
