package javaapplication1;

import java.util.Scanner;

public class Driver {

    public static void main(String[]  args){
        
        Aplikasi app = new Aplikasi();
        app.addGudang(new Gudang(0,"Buahbatu"));
        app.addGudang(new Gudang(1,"Sarirejo"));
        app.addPenyedia(new Penyedia(0,"Firly"));
        app.addPetugas(new Petugas(0,"Krishajar"));
        Scanner input = new Scanner(System.in);
        int pilihan = -1;
        while (pilihan != 0)
        {
        System.out.println("-------------------");
        System.out.println("1. Tambah Penyedia            2. Lihat Penyedia");
        System.out.println("3. Hapus Penyedia             4. Tambah Barang");
        System.out.println("5. Lihat Barang               6. Tambah Petugas");
        System.out.println("7. Lihat Petugas              8. Hapus Petugas");
        System.out.println("9. Buat Gudang                10. Lihat Gudang");
        System.out.println("11. Tambah Barang ke Gudang    12. Lihat Barang di Gudang");
        System.out.println("0. Keluar");
        System.out.print("Silakan Input Pilihan : ");
        pilihan = input.nextInt();
        app.mainMenu(pilihan);
        }
     /*   Penyedia a = new Penyedia(1,"Firly");
        a.createBarang(new Barang(4,"coklat",12));
        a.createBarang(new Barang(5,"coklat2",21));
        a.getBarang(1).getJml_barang();
        //a.removeBarang(0);
        System.out.println(a.getBarang(1).getJml_barang());
        /*a.showAllBarang();
        Petugas pet = new Petugas(0,"Udink");
        pet.createGudang(new Gudang(0,"BuahBatu"));
        pet.createGudang(new Gudang(1,"Cikapundung"));
        pet.getGudang(0).addBarang(new Barang(3,"sosro",3));
        //System.out.println(pet.getGudang(0).getBarang(0).getNama());
        pet.showAllGudang();*/
    }
}