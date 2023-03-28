/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_sederhana;

import java.util.Scanner;

/**
 *
 * @author Galaxy
 */
public class Tabung extends Bangun_ruang {
    
    @Override
    void hitungVolume (){
        volume = (PHI * r * r) * t;
        System.out.println("Volume Tabung : "+volume);
    }
    
    void inputTabung (){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Tabung ===");
        System.out.print("Masukkan jari jari : ");
        r = input.nextDouble();
        System.out.print("Masukkan tinggi    : ");
        t = input.nextDouble();
        System.out.println("===== Hasil =====");       
        hitungVolume();
    }
    
}
