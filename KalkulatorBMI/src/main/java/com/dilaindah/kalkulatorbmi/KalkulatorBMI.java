/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.dilaindah.kalkulatorbmi;

import java.util.Scanner;

/**
 *
 * @author Ideapad 3
 */

public class KalkulatorBMI {
    public static void main(String[]args){
        
        //menggunakan Scanner untuk mengimput data
        Scanner masukan = new Scanner(System.in);
        
        //membuat tipe data dan variabel
        int jenisKelamin;
        float berat, tinggi, bmi, meter;
        
        //membuat perintah untuk memasukkan data
        System.out.println("PROGRAM PERHITUNGAN BMI");
        System.out.println(".........................");
        System.out.println("Jenis kelamin :");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
                
        
        System.out.println("Masukkan jenis kelamin :");
        jenisKelamin = masukan.nextInt();
        System.out.println("Masukkan berat badan :");
        berat = masukan.nextFloat();
        System.out.println("Masukkan tinggi badan :");
        tinggi = masukan.nextFloat();
        
        //penggunaan rumus
        meter = tinggi/100;
        
        //masukkan rumus BMI
        bmi = (berat/(meter*meter));
        
        //kemudian data dicetak
        System.out.println(".........................");
        System.out.println("BMI anda : "+bmi+" ");
        
        //menggunakan percabangan if
        if (bmi<18.5){
            System.out.println("BERAT BADAN ANDA KURANG");
        }   
        else if (bmi<24.9){
            System.out.println("BERAT BADAN ANDA NORMAL");
        }
        else if (bmi<28.9){
            System.out.println("BERAT BADAN ANDA LEBIH");
        }
        else {
            System.out.println("OBESITAS");
        }
        System.out.println("Terima Kasih");
    }
}
        
        
    
    

    

   

