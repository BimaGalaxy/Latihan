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
public class Kubus extends Bangun_ruang {
    
    
    @Override
    void hitungVolume() {
        volume = r * r * r;
        System.out.println("Volume kubus = "+volume);
    }
    
    void InputKubus (){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Kubus ===");
        System.out.println("Masukkan panjang rusuk : ");
        r = input.nextDouble();
        System.out.println("===== Hasil =====");       
        hitungVolume();        
    }
    
}
