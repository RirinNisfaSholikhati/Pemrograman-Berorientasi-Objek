/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class ArrayProcessing {
     // data array 
    int[] dataBil = new int[100];
    
    //jumlah data 
    int n;
    private int temp;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Masukkan bil ke-" +(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    //PROJECT 1 MinMax Project
    //Method mencari nilai Minimum data array
    int cariMin(int[] dataBil){
        int min = dataBil[0];
        for (int i=1; i<this.n; i++){
            if (min > dataBil[i]){
                min = dataBil[i];
            }
        }
        return min;
    }
    
    //Method mencari nilai Maksimum data array
    int cariMax(int[] dataBil){
        int max = dataBil[0];
        for (int i=1; i<this.n; i++){
            if (max < dataBil[i]){
                max = dataBil[i];
            }
        }
        return max;
    }
    
    void output(){
        System.out.println("Reratanya: "+this.hitungRerata(this.dataBil));
        System.out.println("Nilai Minimumnya: " + this.cariMin(dataBil));
        System.out.println("Nilai Maksimumnya: " + this.cariMax(dataBil));
    }
}
