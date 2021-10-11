/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author ASUS
 */
public class Segitiga {
    void hitungluas(int a, int t){
        double luas= 0.5*a*t;
        System.out.println("Luas Segitiga dengan a: "+a+" , t: "+t+" adalah : "+luas);
        System.out.println(" ");
    }
    
    void hitungluas(int a, double t){
        double luas= 0.5*a*t;
        System.out.println("Luas Segitiga dengan a: "+a+" , t: "+t+" adalah : "+luas);
        System.out.println(" ");
    }
    
    void hitungluas(double a, int t){
        double luas= 0.5*a*t;
        System.out.println("Luas Segitiga dengan a: "+a+" , t: "+t+" adalah : "+luas);
        System.out.println(" ");
    }
    
    void hitungluas(double a, double t){
        double luas= 0.5*a*t;
        System.out.println("Luas Segitiga dengan a: "+a+" , t: "+t+" adalah : "+luas);
        System.out.println(" ");
    }
    
    void hitungkeliling(int a, int t){
        double c = Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(t,2)));
        double keliling = a+t+c;
        System.out.println("Keliling Segitiga dengan a: "+a+" , t: "+t+" adalah : "+keliling);
        System.out.println(" ");
    }
    
    void hitungkeliling(int a, double t){
        double c = Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(t,2)));
        double keliling = a+t+c;
        System.out.println("Keliling Segitiga dengan a: "+a+" , t: "+t+" adalah : "+keliling);
        System.out.println(" ");
    }
    
    void hitungkeliling(double a, int t){
        double c = Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(t,2)));
        double keliling = a+t+c;
        System.out.println("Keliling Segitiga dengan a: "+a+" , t: "+t+" adalah : "+keliling);
        System.out.println(" ");
    }
    
    void hitungkeliling(double a, double t){
        double c = Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(t,2)));
        double keliling = a+t+c;
        System.out.println("Keliling Segitiga dengan a: "+a+" , t: "+t+" adalah : "+keliling);
        System.out.println(" ");
    }
}
