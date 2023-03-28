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
public class Bola extends Bangun_ruang {

    @Override
    void hitungVolume() {
        volume = r * r * r * PHI * 4/3;
        System.out.println("Volume Bola = " + volume);
    }

    void InputBola() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Bola ===");
        System.out.print("Masukkan jari-jari bola : ");
        r = input.nextDouble();
        System.out.println("===== Hasil =====");
        hitungVolume();
    }
}
