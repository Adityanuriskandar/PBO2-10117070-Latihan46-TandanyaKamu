/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung umur dan
 * dan detail tanda-tanda usia
 */
public class PBO210117070Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Tanggal Lahir Anda : ");
        int thlhr = scn.nextInt();
        
        System.out.println();
        Age age = new Age(2018);
        age.setYearBirth(thlhr);
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println("Tandanya kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
