/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameimproved;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SilverMember {
    private int tanggalRental, bulanRental, tahunRental, tahunKembali, bulanKembali, tanggalKembali ;    
    protected int biayasewa, poin;
    protected int jmlHari;
    private final Scanner inputA = new Scanner(System.in);
    protected double diskon;
    
    
    //protected void input(){
        //System.out.println("========== Program Pengembalian Console Game ==========");
        //Scanner input1 = new Scanner(System.in);
        //System.out.print("Masukkan Tanggal Pinjam (1-31)  : ");
        //tanggalRental = input1.nextInt();
       //System.out.print("Masukkan Bulan Pinjam (1-12)    : ");
        //bulanRental = input1.nextInt();
        //System.out.print("Masukkan Tahun Pinjam           : ");
        //tahunRental = input1.nextInt();
        //System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        //tanggalKembali = input1.nextInt();
        //System.out.print("Masukkan Bulan Kembali (1-12)   : ");
        //bulanKembali = input1.nextInt();
        //System.out.print("Masukkan Tahun Kembali          : ");
        //tahunKembali = input1.nextInt();
        //System.out.println("");
        //System.out.println("-------------------------------------------------------  ");
        //System.out.println("");
    //}
    
    //Setter Method
    public void setTanggalRental(){
        System.out.println("Masukkan Tanggal Pinjam (1-31)  : ");
        tanggalRental = inputA.nextInt();
        if(this.tanggalRental > 0){
            this.tanggalRental = tanggalRental;
        } else {
            this.tanggalRental = 1;
        }
    }
    
    public void setBulanRental(){
        System.out.println("Masukkan Bulan Pinjam (1-12)    : ");
        bulanRental = inputA.nextInt();
        if(this.bulanRental > 0){
            this.bulanRental = bulanRental;
        } else {
            this.bulanRental =1;
        }
    }
    
    public void setTahunRental(){
        System.out.println("Masukkan Tahun Rental           : ");
        tahunRental = inputA.nextInt();
        if(this.tahunRental > 0){
            this.tahunRental = tahunRental;
        } else {
            this.tahunRental =1;
        }
    }
    
    public void setTanggalKembali(){
        System.out.println("Masukkan Tanggal Kembali (1-12)    : ");
        tanggalKembali = inputA.nextInt();
        if(this.tanggalKembali > 0){
            this.tanggalKembali = tanggalKembali;
        } else {
            this.tanggalKembali =1;
        }
    }
    
    public void setBulanKembali(){
        System.out.println("Masukkan Bulan Kembali (1-12)     : ");
        bulanKembali = inputA.nextInt();
        if(this.bulanKembali > 0){
            this.bulanKembali = bulanKembali;
        } else {
            this.bulanKembali =1;
        }
    }
    
    public void setTahunKembali(){
        System.out.println("Masukkan Tahun Kembali            : ");
        tahunKembali = inputA.nextInt();
        if(this.tahunKembali > 0){
            this.tahunKembali = tahunKembali;
        } else {
            this.tahunKembali =1;
        }
  
    }
    
    public void setHari(){
        LocalDate from = LocalDate.of(this.tahunRental, this.bulanRental, this.tanggalRental);
        LocalDate to = LocalDate.of(this.tahunKembali, this.bulanKembali, this.tanggalKembali);
        Period day = Period.between(from,to);
        this.jmlHari= day.getDays();
    }
    
    //Getter Method
    public int getTanggalRental(){
        return this.tanggalRental;
    }
    public int getBulanRental(){
        return this.bulanRental;
    }
    public int getTahunRental(){
        return this.tahunRental;
    }
    public int getTanggalKembali(){
        return this.tanggalKembali;
    }
    public int getBulanKembali(){
        return this.bulanKembali;
    }
    public int getTahunKembali(){
        return this.tahunKembali;
    }
    public int getHari(){
        return this.jmlHari;
    }
    
    
    //protected int hitungsewa(){
        //LocalDate from = LocalDate.of(tahunRental, bulanRental, tanggalRental);
        //LocalDate to = LocalDate.of(tahunKembali,bulanKembali, tanggalKembali );
        //Period day = Period.between(from,to);
        //jmlHari= day.getDays();
        //System.out.println("Tanggal Pinjam      : " + tanggalRental + "-" + bulanRental + "-" + tahunRental);
        //System.out.println("Tanggal Kembali     : " + tanggalKembali + "-" + bulanKembali + "-" + tahunKembali);
        //System.out.println("Lama Sewa           : " + jmlHari + " hari");
        //System.out.println(" ");
        //return jmlHari;
    //}
    
    public void totalsewa(int biayasewa,double diskon){    
        double totalsewa = (biayasewa * jmlHari)-( biayasewa*jmlHari*diskon );
        System.out.println("Total Sewa          : Rp "+ totalsewa);
    }
    
    public void hitungpoint(int poin){
        int jmlpoin = poin * jmlHari;
        System.out.println("Jumlah Poin         : "+ jmlpoin);
    }
}
