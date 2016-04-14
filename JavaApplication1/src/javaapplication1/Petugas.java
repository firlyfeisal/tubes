package javaapplication1;
import java.util.*;

public class Petugas{
    private String nama;
    private int id;
    private List<Gudang> gud = new ArrayList<>();
	
    public Petugas(int id, String nama){
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
    public Gudang getGudang(int i){
        Object[] array = gud.toArray();
        return (Gudang) array[i];
    }
}