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
public class Tidak_berkaki {
    void class_banyak(int pilihan) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Seperti cacing");
        System.out.println("2. Tidak seperti cacing");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        System.out.println("======================================");

        if (pilihan == 1) {
            Seperticacing pSeperticacing = new Seperticacing();
            pSeperticacing.data_hewan();
        } else if (pilihan == 2) {
            
        }

    }

    void data_hewan() {

    }
}
