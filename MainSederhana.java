/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rexy
 */
public class MainSederhana {
        public static void main(String[] args) {
        Sederhana s1 = new Sederhana(4,8);
        System.out.println("Hasil Penjumlahan = "+Sederhana.Tambah(6, 7));
        System.out.println("Hasil Pengurangan = "+Sederhana.Kurang(8, 5));
        System.out.println("Hasil Perkalian   = "+s1.Kali(3, 5));
        System.out.println("Hasil Pembagian   = "+s1.Bagi(9.0, 4.0));
        s1.Sederhana();
    }
}


