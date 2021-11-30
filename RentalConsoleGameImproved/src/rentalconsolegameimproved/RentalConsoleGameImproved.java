/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameimproved;

import java.util.Scanner;
import java.time.*;
/**
 *
 * @author ASUS
 */
public class RentalConsoleGameImproved {

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
                s.setTanggalRental();
                s.setBulanRental();
                s.setTahunRental();
                s.setTanggalKembali();
                s.setBulanKembali();
                s.setTahunKembali();
                
                a.tampilMember();
                System.out.println("Tanggal Pinjam  : "+ s.getTanggalRental()  +" - "+ s.getBulanRental()  + " - " + s.getTahunRental());
                System.out.println("Tanggal Kembali : "+ s.getTanggalKembali() +" - "+ s.getBulanKembali() + " - " + s.getTahunKembali());
                s.setHari();
                System.out.println("Lama Sewa       : "+ s.getHari()+ " hari");
                s.totalsewa(25000,0.01);
                s.hitungpoint(1);
                
                break;
                
            case "M002":
                Member b = new Member();
                b.addMember(new DataMembership("M002","Mr.Y","Gold"));
                                
                GoldMember gold = new GoldMember();
                gold.setTanggalRental();
                gold.setBulanRental();
                gold.setTahunRental();
                gold.setTanggalKembali();
                gold.setBulanKembali();
                gold.setTahunKembali();
                
                b.tampilMember();
                System.out.println("Tanggal Pinjam  : "+ gold.getTanggalRental()  +" - "+ gold.getBulanRental()  + " - " + gold.getTahunRental());
                System.out.println("Tanggal Kembali : "+ gold.getTanggalKembali() +" - "+ gold.getBulanKembali() + " - " + gold.getTahunKembali());
                gold.setHari();
                System.out.println("Lama Sewa       : "+ gold.getHari()+ " hari");
                gold.totalsewa(30000,0.02);
                gold.hitungpoint(5);
                gold.bonuscash(5000);
                
     
                break;
            
            case "M003":
                Member c = new Member();
                c.addMember(new DataMembership("M003","Mr.Z","Platinum"));
                
                PlatinumMember platinum = new PlatinumMember();
                platinum.setTanggalRental();
                platinum.setBulanRental();
                platinum.setTahunRental();
                platinum.setTanggalKembali();
                platinum.setBulanKembali();
                platinum.setTahunKembali();          
                
                c.tampilMember();
                System.out.println("Tanggal Pinjam  : "+ platinum.getTanggalRental()  +" - "+ platinum.getBulanRental()  + " - " + platinum.getTahunRental());
                System.out.println("Tanggal Kembali : "+ platinum.getTanggalKembali() +" - "+ platinum.getBulanKembali() + " - " + platinum.getTahunKembali());
                platinum.setHari();
                System.out.println("Lama Sewa       : "+ platinum.getHari()+ " hari");
                platinum.totalsewa(45000, 0.03);
                platinum.hitungpoint(10);
                platinum.bonuscash(10000);
                platinum.bonuspulsa(5000);
                  
                break;
                
        }
    }   
}
