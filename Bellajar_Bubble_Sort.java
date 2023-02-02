package bubble_sort;

import java.util.Scanner;

public class Bellajar_Bubble_Sort {
    
    static void BubbleSort (int[] jumlah) {
        
        for (int i = 0; i < jumlah.length; i++) {           
            for (int j = 0; j < jumlah.length - 1; j++) {
                if (jumlah[j] > jumlah[j+1]) {
                    int temp = jumlah[j];
                    jumlah[j] = jumlah[j + 1];
                    jumlah[j + 1] = temp;
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        int[] jumlah = new int[5];
        Scanner input = new Scanner(System.in);
         
          System.out.println("Masukkan bilangan yang mau diinputkan : ");
            
          for (int i = 0; i < jumlah.length; i++) {
              System.out.print("angka ke - "+ (i + 1) +" : ");
              jumlah [i] = input.nextInt();
          }
          
          for (int i = 0; i < jumlah.length; i++) {
              System.out.println(jumlah[i] + " ");
          }
          
          System.out.println("");
          BubbleSort(jumlah);
          for (int i = 0; i < jumlah.length; i++) {
              System.out.println(jumlah[i] + " ");
          }
          
    }
}   
