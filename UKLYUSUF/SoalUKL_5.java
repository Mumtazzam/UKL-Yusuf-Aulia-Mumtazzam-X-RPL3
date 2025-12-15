/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soalukl_5;

/**
 *
 * @author LOQ
 */
import java.util.*;

public class SoalUKL_5 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> komputer = new ArrayList<>();
        ArrayList<Integer> pemain = new ArrayList<>();

        int menangK = 0, menangP = 0;

        while (menangK < 5 && menangP < 5) {
            System.out.print("Tekan enter untuk lempar dadu...");
            sc.nextLine();

            int dk = r.nextInt(6) + 1;
            int dp = r.nextInt(6) + 1;

            komputer.add(dk);
            pemain.add(dp);

            System.out.println("Komputer: " + dk);
            System.out.println("Pemain : " + dp);

            if (dp > dk) {
                System.out.println("Pemain menang ronde ini");
                menangP++;
            } else if (dk > dp) {
                System.out.println("Komputer menang ronde ini");
                menangK++;
            } else {
                System.out.println("Seri");
            }
            System.out.println();
        }

        System.out.println("Permainan selesai");
        System.out.println("Pemenang: " + (menangP > menangK ? "Pemain" : "Komputer"));
        System.out.println("Riwayat komputer: " + komputer);
        System.out.println("Riwayat pemain : " + pemain);
        System.out.println("Menang pemain: " + menangP);
        System.out.println("Menang komputer: " + menangK);
    }
}
