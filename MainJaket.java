
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rexy
 */
public class MainJaket {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pilihan;
        System.out.println("     Asal-Asalan Production    ");
        System.out.println("--------------------------------");
        do {
            System.out.println("Tipe Jaket");
            System.out.println("1. Jaket A : Rp 100.000/pcs    >100 : Rp 95.000/pcs");
            System.out.println("2. Jaket B : Rp 125.000/pcs    >100 : Rp 120.000/pcs");
            System.out.println("3. Jaket C : Rp 175.000/pcs    >100 : Rp 160.000/pcs");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Jaket: ");
            pilihan =scn.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("  Anda memilih JAKET A   ");
                    System.out.println("==========================");
                    Jaket jA = new Jaket();
                    System.out.print("Membeli Jaket A sebanyak : ");
                    int beliA = scn.nextInt();
                    jA.hitungDiskonA(beliA);
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("  Anda memilih JAKET B   ");
                    System.out.println("==========================");
                    Jaket jB = new Jaket();
                    System.out.print("Membeli Jaket B sebanyak : ");
                    int belB = scn.nextInt();
                    jB.hitungDiskonB(belB);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" Anda memilih JAKET C   ");
                    System.out.println("=========================");
                    Jaket jC = new Jaket();
                    System.out.print("Membeli Jaket C sebanyak : ");
                    int beliC =scn.nextInt();
                    jC.hitungDiskonC(beliC);
                    System.out.println(" ");
                    break;
                case 0:
                    System.out.println("========================");
                    System.out.println("Terima Kasih Telah order.");
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    System.out.println(" ");
                    break;
            }
        } while (pilihan != 0);
    }
}

