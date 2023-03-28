
package tugas.pak.candra;

import java.util.Scanner;

public class TugasPakCandra {

    public static void main(String[] args) {
        int jumlahnilai, nilai, rata2 = 0;
        String nama, value_Jk = null, alamat, value_ratarata;
        int absen, kelas;
        Scanner input = new Scanner(System.in);

        System.out.print("nama siswa : ");
        nama = input.nextLine();
        System.out.print("Jenis kelamin siswa L/K : ");
        char jk = input.next().charAt(0);

        if (jk == 'L') {
            value_Jk = "Laki- Laki";
        } else if (jk == 'P') {
            value_Jk = "Perempuan";
        } else {
            value_Jk = "Undefined";
        }

        System.out.print("absen : ");
        absen = input.nextInt();
        System.out.print("kelas : ");
        kelas = input.nextInt();
        alamat = input.nextLine();
        System.out.print("alamat : ");
        alamat = input.nextLine();
        System.out.print("jumlah nilai siswa : ");
        jumlahnilai = input.nextInt();

        for (int i = 1; i <= jumlahnilai; i++) {
            System.out.print("Nilai " + i + " = ");
            nilai = input.nextInt();
            rata2 += nilai;
        }
        double ratarata = rata2 / jumlahnilai;
        if (ratarata >= 75) {
            value_ratarata = "Rata rata nilai = " + ratarata + " LULUS!";
        } else if (ratarata <= 75) {
            value_ratarata = "Rata rata nilai = " + ratarata + " Maaf Tidak Lulus :(";
        } else {
            value_ratarata = "Data tidak valid";
        }

        System.out.println("");
        System.out.println("===== Data Siswa =====");
        System.out.println("Nama          : " + nama +
                "\nJenis kelamin : " + value_Jk +
                "\nKelas         : " + kelas +
                "\nAbsen         : " + absen +
                "\nAlamat        : " + alamat +
                "\nRata2 nilai   : " + value_ratarata);
        System.out.println("======================");
    }
}
