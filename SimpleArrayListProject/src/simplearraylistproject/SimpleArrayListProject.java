/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylistproject;

/**
 *
 * @author Ririnnisfa
 */
import java.util.Scanner;

public class SimpleArrayListProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilihanMenu menu = new PilihanMenu();
        Scanner input = new Scanner(System.in);
        System.out.println("=========SimpleArrayListProject=========");
        while(true){
            System.out.println("Menu Data Arraylist :");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.println("=======================");
            System.out.println("Pilih Nomor Berapa: ");
            int pilih = input.nextInt();
            System.out.println("=======================");
            if (pilih == 1){
                menu.TambahData();
            }
            else if(pilih == 2){
                menu.CariData();
            }
            else if (pilih == 3){
                menu.HapusData();
            }
            else if (pilih == 4){
                menu.TampilData();
            }
            else if (pilih == 5){
                System.out.println("--------SELESAI--------");
                break;
            }
            else{
                System.out.println("Input Yang Dimasukkan Tidak Valid");
        
            }
    
        }
    }
}
