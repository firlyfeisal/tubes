package javaapplication1;
import java.util.*;


public class Penyedia{
    private String nama;
    private int id;
    private Barang[] b = new Barang[50];
    private int nBarang = 0;

    public Penyedia(int id, String nama){
	this.id=id;
	this.nama=nama;
    }

    public String getNama(){
        return nama;
    }	
    public void setNama(String nama){
	this.nama = nama;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
	this.id = id;
    }
    public void createBarang(int id, String nama, int jml_barang){
	b[nBarang] = new Barang(id, nama, jml_barang);
        
	nBarang++;
    }
    public Barang getBarang(int i){
	return b[i];
    }
    public int getnBarang(){
	return nBarang;
    }
    public void showBarang(){
	for(int i = 0; i < b.length; i++){
            System.out.println("id barang: "+getBarang(i).getId());
            System.out.println("nama barang: "+getBarang(i).getNama());
            System.out.println("jumlah barang: "+getBarang(i).getJml_barang());
        } 
    }
    public void removeBarang (int del){
        for(int i = 0; i < b.length; i++){
            if(del == i){
		b[i]= null;
            }
	}
    }
	
}
