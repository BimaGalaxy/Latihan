/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Klasifikasi_Hewan;
import java.util.ArrayList;
/**
 *
 * @author Galaxy
 */
public class Tidak_seperti_cacing extends Tidak_berkaki {
    @Override
    void data_hewan (){
        ArrayList<String> hewan = new ArrayList<String>();
        System.out.println("Hewan tidak seperti cacing : ");
        hewan.add("- Fluke Worm\n");
        hewan.add("- Tape Worm\n");
        System.out.println(hewan);
    }
}
