
package bubble_sort;

import java.util.Scanner;

public class Bubble_sort {

    public static void main(String[] args) {

        int jumlah, i, j, swap;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan jumlah billangan yang mau diinputkan : ");
        jumlah = scan.nextInt();

        int array[] = new int[jumlah];
        System.out.println("\nMasukkan " + jumlah + "Buah bilangan integer");
        System.out.println("=============================================");
        for (i = 0; i < jumlah; i++) {

            System.out.println("Bilangan ke- " + (i + 1) + " =");
            array[i] = scan.nextInt();

        }

        System.out.println("\nBilangan sebelum diurutkan");
        for (int a = 0; a < jumlah; a++) {

            System.out.println(array[a]);

        }

        for (i = 0; i < (jumlah - 1); i++) {

            for (j = 0; j < jumlah - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println("\nBilangan setelah diurutkan :");
        for (i = 0; i < jumlah; i++) {
            System.out.println(array[i]);
        }

    }

}
