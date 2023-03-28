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
public class Prisma extends Bangun_ruang {

    @Override
    void hitungVolume() {
        volume = l * t;
        System.out.println("Volume Prisma = " + volume);
    }

    void InputPrisma() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Prisma ===");
        System.out.print("Masukkan Luas alas : ");
        l = input.nextDouble();
        System.out.print("Masukkan tinggi    : ");
        t = input.nextDouble();
        System.out.println("===== Hasil =====");
        hitungVolume();
    }
}
