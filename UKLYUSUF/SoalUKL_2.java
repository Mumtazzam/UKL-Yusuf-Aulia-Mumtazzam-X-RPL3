/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soalukl_2;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class SoalUKL_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000};

        System.out.print("Masukkan jumlah uang: ");
        int uang = sc.nextInt();

        for (int p : pecahan) {
            int jumlah = uang / p;
            if (jumlah > 0) {
                System.out.println(jumlah + " Lembar " + p);
                uang %= p;
            }
        }
    }
}
