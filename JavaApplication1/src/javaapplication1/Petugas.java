package javaapplication1;

public class Petugas{
	private String nama;
	private int id;
	
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
}	