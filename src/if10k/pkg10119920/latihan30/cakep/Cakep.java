/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119920.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 */

public class Cakep {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String jawab;
        String normal = "\u001b[0m";
        String merah = "\u001b[31m";
        String hijau = "\u001b[32m";
        String kuning = "\u001b[33m";
        String biru = "\u001b[34m";
        String ungu = "\u001b[35m";
        String birumuda = "\u001b[36m";
        String putih = "\u001b[37m";
        
        System.out.print(merah + "Kamu " + hijau + "ngerjain sendiri " + kuning + "latihan 17 sampe " + biru + "latihan 30 ini? \nJawab " + merah + "(Yoi/Enggak) : " + normal);
        jawab = input.next();
        jawab = jawab.toUpperCase();
        System.out.println("\n");
        if(jawab.equals("YOI"))
            {
            System.out.println(merah + "Cakep bener. " + ungu + "Good Job" + normal);
            }
        else if(jawab.equals("ENGGAK"))
            {
            System.out.println(merah + "Tetep cakep sih.\n" + birumuda + "Sing penting paham konsep nya yee.\n" + normal + "Keep the code works dude");
            }
        else
            System.out.println(" ");
    }
}