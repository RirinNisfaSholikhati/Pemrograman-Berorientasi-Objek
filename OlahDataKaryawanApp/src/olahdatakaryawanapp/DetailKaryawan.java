/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olahdatakaryawanapp;

/**
 *
 * @author ririn nisfa
 */
public class DetailKaryawan extends Karyawan {
    String kodeKaryawan,namaKaryawan,gol,statusNikah;
    private int gaji_pokok;
    
    //constructor
    public DetailKaryawan(String kode, String nama, String gol, int usia, int status, int jmlanak) {
        this.kodeKaryawan = kode;
        this.namaKaryawan = nama;
        this.gol = gol;
        if(status == 0){
            this.status = status;
            this.statusNikah = "Belum Menikah";
        } else if(status == 1){
            this.status = status;
            this.statusNikah = "Menikah";
        }
        this.usia = usia;
        this.jmlanak = jmlanak;
    }
    
    @Override
    public int hitungGajiPokok(){
        switch(gol){
            case "A":
                gaji_pokok = 5000000;
                break;
            case "B":
                gaji_pokok = 6000000;
                break;
            case "C":
                gaji_pokok = 7000000;
                break;
        }
        return gaji_pokok;
    }
    
    
    
    //Method untuk menampilkan header tabel lihat data
    void tampilData(){
        System.out.print(this.kodeKaryawan + "\t\t");
        System.out.print(this.namaKaryawan + "\t\t");
        System.out.print(this.gol + "\t");
        System.out.print(this.usia + "\t");
        System.out.print(this.statusNikah + "\t\t");
        System.out.print(this.jmlanak + "\n");
    }
    
    //Method untuk menampilkan detail data karyawan
    void appearDataProfil(){
        System.out.println("================================================\n"+
                           "DATA PROFILE KARYAWAN\n"+
                           "-----------------------------------------------------------------"
                           );  
        System.out.println("Kode Karyawan          : "+this.kodeKaryawan);
        System.out.println("Nama Karyawan          : "+this.namaKaryawan);
        System.out.println("Golongan               : "+this.gol);
        System.out.println("Usia                   : "+this.usia);
        System.out.println("Status Menikah         : "+this.statusNikah);
        System.out.println("Jumlah Anak            : "+this.jmlanak);
    }
    
    //Method untuk menampilkan detail gaji
    public void appearGaji(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Gaji Pokok             : Rp "+this.hitungGajiPokok());
        System.out.println("Tunjangan Istri/Suami  : Rp "+this.hitungTunjNikah(status));
        System.out.println("Tunjangan Pegawai      : Rp "+this.hitungTunjPegawai());
        System.out.println("Tunjangan Anak         : Rp "+this.hitungTunjAnak(jmlanak));
        System.out.println("---------------------------------------------------------------- + ");
        System.out.println("Gaji Kotor             : Rp "+this.hitungGajiKotor());
        System.out.println("Potongan               : Rp "+this.hitungPotongan());
        System.out.println("---------------------------------------------------------------- - ");
        System.out.println("Gaji Bersih            : Rp "+this.hitungGajiBersih());
    }   
}
