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
public class Limas extends Bangun_ruang {

    @Override
    void hitungVolume() {
        volume = (((p * l)*1/2)*t)*1/3;
        System.out.println("Volume Limas = " + volume);
    }

    void InputLimas() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Limas ===");
        System.out.print("Masukkan panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan luas    : ");
        l = input.nextDouble();
        System.out.print("Masukkan tinggi  : ");
        t = input.nextDouble();
        System.out.println("===== Hasil =====");
        hitungVolume();
    }
}
