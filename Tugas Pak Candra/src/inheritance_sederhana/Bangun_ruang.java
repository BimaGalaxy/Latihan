
package inheritance_sederhana;

import java.util.Scanner;

public class Bangun_ruang {
    
    double p, l, t, r, volume;
    final double PHI = 3.14;
    
    public void pilihan() {
       
       int pilihan;
       
       System.out.println("Masukkan Pilihan: ");
       System.out.println("1. Volume kubus");
       System.out.println("2. Volume balok");
       System.out.println("3. Volume tabung");
       System.out.println("4. Volume kerucut");
       System.out.println("5. Volume limas");
       System.out.println("6. Volume prisma");
       System.out.println("7. Volume bola");
       System.out.println("--------------------------------------");
       
       Scanner input = new Scanner(System.in);
       
       pilihan = input.nextInt();
       
       if (pilihan == 1){
           Kubus pKubus = new Kubus();
           pKubus.InputKubus();
       }
       if (pilihan == 2) {
           Balok pBalok = new Balok();
           pBalok.inputBalok();
       }
       if (pilihan == 3) {
           Tabung pTabung = new Tabung();
           pTabung.inputTabung();
       }
       if (pilihan == 4) {
           Kerucut pKerucut = new Kerucut();
           pKerucut.inputKerucut();
       }
       if (pilihan == 5) {
           Limas pLimas = new Limas ();
           pLimas.InputLimas();
       }
       if (pilihan == 6) {
           Prisma pPrisma = new Prisma();
           pPrisma.InputPrisma();
       }
       if (pilihan == 7) {
           Bola pBola = new Bola();
           pBola.InputBola();
       }
       
       
   }
    
    
    void hitungVolume() {
        
    }
    
}
