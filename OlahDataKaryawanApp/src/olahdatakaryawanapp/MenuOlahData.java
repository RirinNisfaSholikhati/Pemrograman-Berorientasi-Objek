/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olahdatakaryawanapp;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Scanner;
import java.text.ParseException;

/**
 *
 * @author ririn nisfa
 */
public class MenuOlahData {
    ArrayList<DetailKaryawan> list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    int pilih;
    String kode, nama;
    
    //Menu Utama
    void MenuUtama() throws ParseException
    {
        boolean pilihMenuUtama = true;
        while(pilihMenuUtama){
        System.out.println("==============================================================="
                                + "\n                  SISTEM OLAH DATA KARYAWAN               "
                                + "\n===============================================================\n"
                    +      "Menu Utama \n" +
                           "1. Tambah Data\n"+
                           "2. Hapus Data\n"+
                           "3. Cari Data\n"+
                           "4. Lihat Data\n"+
                           "5. Exit");
        System.out.println(" ");
        System.out.print("Masukkan Menu Pilihan Anda : ");
        this.pilih = input.nextInt();
        input.nextLine();
        
        switch(pilih){
            case 1: 
                char case1 ='y';
                while(case1 == 'y'){
                    addData();
                }
                break;
            case 2: 
                deleteData();
                break;
            case 3: 
                searchData();
                break;
            case 4: 
                viewData();               
                break;
            case 5: 
                System.exit(0);
            default:
                System.out.println("Pilihan Menu yang Anda masukkan tidak ada!");
            }
        }
    }
    
    public void SubMenu(String submenu){ 
        System.out.println(" ");
        System.out.println("Pilih SubMenu: \n"+
                "1.Kembali ke menu utama \n"+
                "2."+submenu+ " Data kembali \n"
                );
        System.out.println(" ");
        System.out.print("Menu Pilihan: ");
        pilih = input.nextInt();
    }
    
    //Method Tambah Data Karyawan
    public void addData() throws ParseException{
        String alamat, gol;
        int usia, status, jmlanak;
        DateFormat tgl,bln,thn;
        Date date;
        String input1;

        tgl = new SimpleDateFormat("dd");
        bln = new SimpleDateFormat("MM");
        thn = new SimpleDateFormat("yyyy");
        date = new Date();
        
        System.out.println("\n-----------------------Tambah Data Karyawan-----------------------\n");
        System.out.print("Masukkan Kode Karyawan                                         : ");
        this.kode = input.nextLine();
        System.out.print("Masukkan Nama Karyawan                                         : ");
        this.nama = input.nextLine();
        System.out.print("Masukkan Alamat                                                : ");
        alamat = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD)                            : ");
        input1 = input.nextLine();
        System.out.print("Masukkan Golongan ( A | B | C )                                : ");
        gol = input.nextLine();
        System.out.print("Masukkan Status Menikah (0 = belum menikah | 1 = sudah menikah : ");
        status = input.nextInt();
        jmlanak = 0;
        if (status == 1){
            System.out.print("Masukkan Jumlah Anak                                           : ");
            jmlanak = input.nextInt();
        } else if (status == 0 ){
            jmlanak = 0;
        }
        
        //Konversi tanggal untuk menghitung usia
       int tgllhr = Integer.parseInt(input1.substring(8,10));
       int blnlhr = Integer.parseInt(input1.substring(5,7));
       int thnlhr = Integer.parseInt(input1.substring(0,4));
       
       int tglHari = Integer.parseInt(tgl.format(date));
       int blnHari = Integer.parseInt(bln.format(date));
       int thnHari = Integer.parseInt(thn.format(date));
       
       usia = thnHari - thnlhr;
       if(blnHari - blnlhr < 0){
           usia -= 1;
       }
        
        //Masukkan data input ke dalam array
        this.list.add(new DetailKaryawan(kode,nama,gol,usia,status,jmlanak));
        
        //Tampilkan SubMenu
        this.SubMenu("Tambahkan");
        switch(pilih){
            case 1:
                this.MenuUtama();
                break;
            case 2:
                addData();
                break;
            default:
                this.MenuUtama();
                break;
        }
    }
    
    //method pilihan hapus data dengan kode
    public void deleteData() throws ParseException{
        boolean found = false;
        int index = -1;
        System.out.println("\n-----------------------Hapus Data Karyawan-----------------------\n");
        System.out.print("Kode Karyawan yang mau dihapus   : ");
        this.kode = input.nextLine();
        System.out.println("please wait...");
        
        for(int i=0; i<this.list.size(); i++){
            if(this.list.get(i).kodeKaryawan.equals(kode)){
                index = i;
                found = true;
            }
        }
        
        if (found == true){
            this.list.removeIf(item -> item.kodeKaryawan.equals(kode));
            System.out.println("Data Karyawan dengan kode "+ kode + " berhasil dihapus");
        } else {
            System.out.println("Gagal menghapus data! Data karyawan dengan kode "+kode+" tidak ditemukan");
        }     
        
        //Tampilkan SubMenu
        this.SubMenu("Hapus");
        switch(pilih){
            case 1:
                this.MenuUtama();
                break;
            case 2:
                deleteData();
                break;
            default:
                this.MenuUtama();
                break;
        }
    }
    
    //Method Cari Data Karyawan
    public void searchData() throws ParseException{
        boolean found = false;
        int index = -1;
        
        System.out.println("\n-----------------------Cari Data Karyawan-----------------------\n");
        System.out.print("Masukkan Kode Karyawan      : ");
        this.kode = input.nextLine();
        System.out.println("please wait...\n");
        
        for(int i=0; i<this.list.size(); i++){
            if(this.list.get(i).kodeKaryawan.equals(kode)){
                index = i;
                found = true;
            }
        }
        
        if (found == true){
            this.list.get(index).appearDataProfil();
            this.list.get(index).appearGaji();
        } else {
            System.out.println("Data Karyawan tidak ditemukan!");
        }     
        
        System.out.println(" ");
        System.out.println("Pilih SubMenu: \n"+
                "1.Kembali ke menu utama \n"
                );
        System.out.print("Menu Pilihan: ");
        pilih = input.nextInt();
        switch(pilih){
            case 1:
                this.MenuUtama();
                break;
            default:
                this.MenuUtama();
                break;
        }
        
        
    }
    
    //Methd Lihat Data Karyawan
    public void viewData() throws ParseException{
        int index = 0;
        System.out.println("===============================================================");
                
        if(this.list.isEmpty()){
            System.out.println("Data Karyawan Belum Ada!");
        } else{
            System.out.println("DATA KARYAWAN ");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.print("KODE KARY \t");
            System.out.print("NAMA KARY \t");
            System.out.print("GOL \t");
            System.out.print("USIA \t");
            System.out.print("STATUS \t\t");
            System.out.print("JUMLAH ANAK\n");
            System.out.println("-------------------------------------------------------------------------------------");
            for(DetailKaryawan item: this.list){
                item.tampilData();
                index++;
            }
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Jumlah Data: "+index);
        }
       
        System.out.println(" ");
        System.out.println("Pilih SubMenu: \n"+
                "1.Kembali ke menu utama \n"
                );
        System.out.println(" ");
        System.out.print("Menu Pilihan: ");
        pilih = input.nextInt();
        switch(pilih){
            case 1:
                this.MenuUtama();
                break;
            default:
                this.MenuUtama();
                break;
        }
    }
}
