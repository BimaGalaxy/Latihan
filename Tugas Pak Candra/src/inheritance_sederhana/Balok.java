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
public class Balok extends Bangun_ruang{
    
    void hitungVolume() {
         volume = p * l * t;
         System.out.println("Volume balok : "+volume);
    }
    
    void inputBalok (){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Balok ===");
        System.out.print("Masukkan nilai panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan nilai lebar   : ");
        l = input.nextDouble();
        System.out.print("Masukkan nilai tinggi  : ");
        t = input.nextDouble();
        System.out.println("===== Hasil =====");
        
        hitungVolume();
        
    }
    
}
