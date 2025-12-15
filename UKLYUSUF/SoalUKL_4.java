/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soalukl_4;

/**
 *
 * @author LOQ
 */
public class SoalUKL_4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        boolean ada = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + arr[i]);
                    ada = true;
                    break;
                }
            }
            if (ada) {
                break;
            }
        }

        if (!ada) {
            System.out.println("Array tidak memiliki elemen duplikat");
        }
    }
}
