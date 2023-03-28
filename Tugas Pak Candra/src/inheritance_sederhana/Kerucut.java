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
public class Kerucut extends Bangun_ruang {

    @Override
    void hitungVolume() {
        volume = (1.0 / 3.0) * (PHI * r * r)*t;
        System.out.println("Volume Kerucut : " + volume);
    }

    void inputKerucut() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Kerucut ===");
        System.out.print("Masukkan jari jari : ");
        r = input.nextDouble();
        System.out.print("Masukkan tinggi    : ");
        t = input.nextDouble();
        System.out.println("===== Hasil =====");
        hitungVolume();
    }
}
