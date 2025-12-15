/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soalukl_3;

/**
 *
 * @author LOQ
 */
import java.util.Random;
import java.util.Scanner;

public class SoalUKL_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char[] op = {'*', '/', '%'};
        String lanjut;

        do {
            float a = r.nextFloat(10) + 1;
            float b = r.nextFloat(9) + 1;
            char operator = op[r.nextInt(3)];

            System.out.print(a + " " + operator + " " + b + " = ");
            float jawab = sc.nextInt();
            float hasil = 0;

            switch (operator) {
                case '*':
                    hasil = a * b;
                    break;
                case '/':
                    hasil = a / b;
                    break;
                case '%':
                    hasil = a % b;
                    break;
            }

            System.out.println("Jawaban benar: " + hasil);
            System.out.print("Lanjut? (yes/no): ");
            lanjut = sc.next();
        } while (lanjut.equalsIgnoreCase("yes"));
    }
}
