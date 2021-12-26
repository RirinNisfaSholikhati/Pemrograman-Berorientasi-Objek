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
public abstract class Karyawan {
    String kode,nama;
    int status, usia, jmlanak;
    
    //method abstract untuk hitung gaji pokok
    public abstract int hitungGajiPokok();
    
    //Method untuk menghitung tunjangan nikah
    public int hitungTunjNikah(int statusnikah){
        int tunjStatusMenikah;
        this.status = statusnikah;
        if (status == 1){
            tunjStatusMenikah = (int) (this.hitungGajiPokok()* 0.1);
        } else{
            tunjStatusMenikah = 0;
        }
        return tunjStatusMenikah;
    }
    
    //Method hitung tunjangan pegawai
    public int hitungTunjPegawai(){
        int tunjPegawai;
        if (usia > 30){
            tunjPegawai = (int) (this.hitungGajiPokok() * 0.15);
        } else {
            tunjPegawai = 0;
        }
        return tunjPegawai;
    }
    
    //Method hitung tunjangan anak 
    public int hitungTunjAnak(int jmlanak){
        this.jmlanak = jmlanak;
        int tunjanganAnak = (int) (this.hitungGajiPokok()* 0.05 * this.jmlanak);
        return tunjanganAnak;
    }
    
    //Method hitung total tunjangan 
    public int hitungTotalTunj(){
        int totalTunjangan = this.hitungTunjNikah(status) + this.hitungTunjPegawai() +this.hitungTunjAnak(jmlanak);
        return totalTunjangan;
    }
    
    //Method hitung gaji kotor (gaji bersih + total tunjangan)
    public int hitungGajiKotor(){
        int gajikotor = this.hitungGajiPokok() + this.hitungTotalTunj();
        return gajikotor;
    }
    
    //Method hitung potongan
    public int hitungPotongan(){
        int potongan = (int) (0.025 * this.hitungGajiKotor());
        return potongan;
    }
    
    //Method hitung gaji bersih
    public int hitungGajiBersih(){
        int gajibersih = this.hitungGajiKotor() - this.hitungPotongan();
        return gajibersih;
    }
}