/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylistproject;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.ArrayList;
import  static java.util.Collections.binarySearch;

public class PilihanMenu {
    ArrayList <String> data = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);
        
    //Method untuk menambahkan dara
    void TambahData() {
        System.out.println("Masukkan Data String : ");
        data.add(input.nextLine());
        System.out.println("Daftar String Dalam Array List :"+ data);
        input.nextLine();
        System.out.println("----------------------------------------------------");
        System.out.println("");
    }
    
    //Method untuk mencari data 
    void CariData() {
        System.out.println("Masukkan string yang ingin dicari: ");
        String cari = input.nextLine();
        if(binarySearch(data, cari) > -1){
            System.out.println("String " + cari + " berada pada index ke-" + this.data.indexOf(cari) + " di dalam data");  
        }
        else{
            System.out.println("String " + cari + " tidak ada di dalam data");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("");
    }
    
    //Method untuk menghapus data
    void HapusData() {
        
        System.out.println("Silahkan pilih string yang Dihapus : ");
        String hapus = input.nextLine();
        
        if(binarySearch(data, hapus) > -1){
            data.remove(binarySearch(data, hapus));
            System.out.println("String " + hapus+ " sudah dihapus dari data");
        }
        else{
            System.out.println("String " + hapus+ " tidak ada didalam data");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("");
    }
    
    //Method untuk menampilkan data
    void TampilData(){
        System.out.println("Daftar string dalam array list: " + data); 
        System.out.println("----------------------------------------------------");
        System.out.println("");
    }
    
}

