package javaapplication1;
import java.util.*;

public class Aplikasi {
	private Penyedia[] daftarPenyedia = new Penyedia[20];
	private Petugas[] daftarPetugas = new Petugas[20];
	private int nPetugas = 0;
	private int nPenyedia = 0;
	private int i;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in); 
	
	public void addPenyedia(int id, String nama){
		daftarPenyedia[nPenyedia] = new Penyedia(id, nama);
		nPenyedia++;
	}	
	public void addPetugas(int id, String nama){
		daftarPetugas[nPetugas] = new Petugas(id, nama);
		nPetugas++;
	}	
	public Penyedia getPenyedia(int id){
		//for(i = 0; i < daftarPenyedia.length; i++){
			//if(id == daftarPenyedia[i].getId()){
				//break;
			//}
		//}
		return daftarPenyedia[id];
	}
	public Petugas getPetugas(int id){
		//for(i = 0; i < daftarPetugas.length; i++){
			//if(id == daftarPetugas[i].getId()){
				//break;
			//}
		//}
		return daftarPetugas[id];
	}
	public void removePenyedia (int id){
		for(i = 0; i < daftarPenyedia.length; i++){
			if(id == daftarPenyedia[i].getId()){
				daftarPenyedia[i]= null;
			}
		}
	}
	public void removePetugas (int id){
		for(int i = 0; i < daftarPetugas.length; i++){
			if(id == daftarPetugas[i].getId()){
				daftarPetugas[i]= null;
			}
		}
	}
	public void mainMenu(int pilihan){
		switch(pilihan){
			case 1 :
				System.out.println("Add Penyedia");
				System.out.println("Input ID : ");
                                int x1 = input.nextInt();
                                System.out.println("Input Nama : ");
                                String y1 = input2.nextLine();
                                addPenyedia(x1,y1);
                                break;
                        case 2 :
                                System.out.println("Hapus Penyedia");
                                System.out.println("Input ID Penyedia");
                                int x2 = input.nextInt();
                                removePenyedia(x2);
                                break;
                        case 3 :
                                System.out.println("Pilih Penyedia");
                                System.out.println("Input ID Penyedia : ");
                                int x3 = input.nextInt();
                                getPenyedia(x3);
                                System.out.println("ID : "+daftarPenyedia[i].getId());
                                System.out.println("Nama : "+daftarPenyedia[i].getNama());
                                break;
                        case 4 :
				System.out.println("Add Petugas");
				System.out.println("Input ID : ");
                                int x4 = input.nextInt();
                                System.out.println("Input Nama : ");
                                String y4 = input2.nextLine();
				addPenyedia(x4,y4);
                                break;
                        case 5 :
                                System.out.println("Hapus Petugas");
                                System.out.println("Input ID Petugas");
                                int x5 = input.nextInt();
                                removePenyedia(x5);
                                break;
                        case 6 :
                                System.out.println("Pilih Petugas");
                                System.out.println("Input ID Petugas : ");
                                int x6 = input.nextInt();
                                getPenyedia(x6);
                                System.out.println("ID : "+daftarPenyedia[i].getId());
                                System.out.println("Nama : "+daftarPenyedia[i].getNama());
                                break;
                        default :
                                System.out.println("Invalid");
                                break;
                }
        }
}
