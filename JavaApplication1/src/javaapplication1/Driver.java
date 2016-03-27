/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author krishajar dan firly test123123123
 * // test12345
 */
public class Driver {

    public static void main(String[]  args){
        Aplikasi a = new Aplikasi();
        int pilihan;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        System.out.println("1. Add Penyedia");
        System.out.println("2. Del Penyedia");
        System.out.println("3. Pilih Penyedia");
        System.out.println("4. Add Petugas");
        System.out.println("5. Del Petugas");
        System.out.println("6. Pilih Petugas");
        pilihan = input.nextInt();
        a.mainMenu(pilihan);
        
        // Masih tidak sesuai...
    }
}
