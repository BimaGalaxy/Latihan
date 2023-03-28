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
public class KakiTiga extends Berkaki_banyak{
     @Override
    void data_hewan (){
        ArrayList<String> hewan = new ArrayList<String>();
        System.out.println("Hewan berkaki tiga pasang : ");
        hewan.add("- Ant\n");
        hewan.add("- Cockroch\n");
        hewan.add("- Ladybug");
        System.out.println(hewan);
    }
}
