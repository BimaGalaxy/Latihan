/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Klasifikasi_Hewan;

import java.util.Scanner;

/**
 *
 * @author Galaxy
 */
public class Hewan {

    public static void main(String[] args) {
        int pilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("==== Invertebrata ====");
        System.out.println("1. Berkaki banyak");
        System.out.println("2. Tidak berkaki");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();
        System.out.println("======================");

        if (pilihan == 1) {
            Berkaki_banyak pKakibanyak = new Berkaki_banyak();
            pKakibanyak.class_banyak(pilihan);
        } else if (pilihan == 2) {
            Tidak_berkaki pTidak_berkaki = new Tidak_berkaki();
            pTidak_berkaki.class_banyak(pilihan);
        }

    }
}
