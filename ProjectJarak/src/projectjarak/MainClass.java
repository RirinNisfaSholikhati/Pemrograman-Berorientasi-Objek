/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjarak;

/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instansiasi
        MobilSedan sedan = new MobilSedan();
        MobilSUV suv = new MobilSUV();
        MobilMPV mpv  = new MobilMPV();
        
        //mendeklarasikan array 
        String[][] data = {
            {"A","Sedan","107","60"},
            {"B","Sedan","538","65"},
            {"C","SUV","662","57"},
            {"D","SUV","471","62"},
            {"E","MPV","541","64"},
            {"F","MPV","433","53"},
        };
        
        for(int i=0; i< data.length; i++){
            if(data[i][1] == "Sedan"){
                sedan.jarak = Double.parseDouble(data[i][2]);
                sedan.kec = Double.parseDouble(data[i][3]);
                sedan.hitungBahanbakar();
                sedan.hitungWaktu();
                System.out.println("\nNama Mobil : " + data[i][0]);
                System.out.println("Jenis Mobil : " + data[i][1]);
                sedan.tampilkan();
            }
            
            else if(data[i][1] == "SUV"){
                suv.jarak = Double.parseDouble(data[i][2]);
                suv.kec = Double.parseDouble(data[i][3]);
                suv.hitungBahanbakar();
                suv.hitungWaktu();
                System.out.println("\nNama Mobil : " + data[i][0]);
                System.out.println("Jenis Mobil : " + data[i][1]);
                suv.tampilkan();
            }
            
            else if(data[i][1] == "MPV"){
                mpv.jarak = Double.parseDouble(data[i][2]);
                mpv.kec = Double.parseDouble(data[i][3]);
                mpv.hitungBahanbakar();
                mpv.hitungWaktu();
                System.out.println("\nNama Mobil : " + data[i][0]);
                System.out.println("Jenis Mobil : " + data[i][1]);
                mpv.tampilkan();
            }
            
            else {
                System.out.println("Data tidak Valid");
            }
        }
    }
    
}
