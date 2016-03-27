package javaapplication1;

public class Gudang {
	private Barang[] g = new Barang[50];
	private int nBarang = 0;
	
	public void addBarang(int id, String nama, int jml_barang){
		g[nBarang] = new Barang(id, nama, jml_barang);
		nBarang++;			
	}
	
	public Barang getBarang(int i){
		return g[i];
	}
	
	public void showBarang(){
		for(int i = 0; i < g.length; i++){
            System.out.println("id barang: "+getBarang(i).getId());
			System.out.println("nama barang: "+getBarang(i).getNama());
			System.out.println("jumlah barang: "+getBarang(i).getJml_barang());
        } 
	}	
	
	public void removeBarang (int del){
		for(int i = 0; i < g.length; i++){
			if(del == i){
			g[i]= null;
			}
		}
	}
	
}
