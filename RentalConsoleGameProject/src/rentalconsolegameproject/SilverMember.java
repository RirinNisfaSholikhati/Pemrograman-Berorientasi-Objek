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
public class SilverMember {
    protected int tanggalRental, bulanRental, tahunRental, tahunKembali, bulanKembali, tanggalKembali, jmlHari;    
    protected int biayasewa, poin;
    protected double diskon;
    
    protected void input(){
        System.out.println("========== Program Pengembalian Console Game ==========");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam (1-31)  : ");
        tanggalRental = input1.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12)    : ");
        bulanRental = input1.nextInt();
        System.out.print("Masukkan Tahun Pinjam           : ");
        tahunRental = input1.nextInt();
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        tanggalKembali = input1.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)   : ");
        bulanKembali = input1.nextInt();
        System.out.print("Masukkan Tahun Kembali          : ");
        tahunKembali = input1.nextInt();
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("");
    }
    
    protected int hitungsewa(){
        LocalDate from = LocalDate.of(tahunRental, bulanRental, tanggalRental);
        LocalDate to = LocalDate.of(tahunKembali,bulanKembali, tanggalKembali );
        Period day = Period.between(from,to);
        jmlHari= day.getDays();
        System.out.println("Tanggal Pinjam      : " + tanggalRental + "-" + bulanRental + "-" + tahunRental);
        System.out.println("Tanggal Kembali     : " + tanggalKembali + "-" + bulanKembali + "-" + tahunKembali);
        System.out.println("Lama Sewa           : " + jmlHari + " hari");
        System.out.println(" ");
        return jmlHari;
    }
    
    protected void totalsewa(int biayasewa,double diskon){    
        double totalsewa = (biayasewa * jmlHari)-( biayasewa*jmlHari*diskon );
        System.out.println("Total Sewa          : Rp "+ totalsewa);
    }
    
    protected void hitungpoint(int poin){
        int jmlpoin = poin * jmlHari;
        System.out.println("Jumlah Poin         : "+ jmlpoin);
    }
}
