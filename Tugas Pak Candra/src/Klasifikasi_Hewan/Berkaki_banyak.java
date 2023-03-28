package Klasifikasi_Hewan;

import java.util.Scanner;

public class Berkaki_banyak {

    void class_banyak(int pilihan) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Dengan kaki lebih dari tiga pasang");
        System.out.println("2. Dengan kaki tiga pasang");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        System.out.println("======================================");

        if (pilihan == 1) {
            Kaki_l3 pKaki_l3 = new Kaki_l3();
            pKaki_l3.data_hewan();
        } else if (pilihan == 2) {
            KakiTiga pKakitiga = new KakiTiga();
            pKakitiga.data_hewan();
        }

    }

    void data_hewan() {

    }
}
