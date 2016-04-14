package javaapplication1;
import java.util.*;

public class Aplikasi {
        private List<Penyedia> daftarPenyedia = new ArrayList<>();
        private List<Petugas> daftarPetugas = new ArrayList<>();
        private List<Gudang> daftarGudang = new ArrayList<>();
	private int i;
        Scanner input = new Scanner(System.in); 
	
	public void addPenyedia(Penyedia i){
		daftarPenyedia.add(i);
	}	
	public void addPetugas(Petugas i){
		daftarPetugas.add(i);
	}	       
        public void addGudang(Gudang i){
                daftarGudang.add(i);
        }
	public Penyedia getPenyedia(int i){
            Object[] array = daftarPenyedia.toArray();
            return (Penyedia) array[i];
	}
	public Petugas getPetugas(int i){
            Object[] array = daftarPetugas.toArray();
            return (Petugas) array[i];
	}
	public Gudang getGudang(int i){
            Object[] array = daftarGudang.toArray();
            return (Gudang) array[i];
	}         
	public void removePenyedia (int i){
            daftarPenyedia.remove(i);
	}
	public void removePetugas (int i){
            daftarPetugas.remove(i);
	}
	public void removeGudang (int i){
            daftarGudang.remove(i);
	}
        public void showAllPenyedia(){
            int i = 0;
            for (Penyedia obj : daftarPenyedia)
            {           
                System.out.println("Indeks : "+i);
                System.out.println("ID : "+obj.getId());
                System.out.println("Nama : "+obj.getNama());
                System.out.println("====================================");
                i++;
            }
        }
        public void showAllPetugas(){
            int i = 0;
            for (Petugas obj : daftarPetugas)
            {           
                System.out.println("Indeks : "+i);
                System.out.println("ID : "+obj.getId());
                System.out.println("Nama : "+obj.getNama());
                System.out.println("====================================");
                i++;
            }
        }
        public void showAllGudang(){
            int i = 0;
            for (Gudang obj : daftarGudang)
            {           
                System.out.println("Indeks : "+i);
                System.out.println("ID : "+obj.getId());
                System.out.println("Nama : "+obj.getNama());
                System.out.println("====================================");
                i++;
            }
        }
	public void mainMenu(int pilihan){
		switch(pilihan){
			case 1 :
                            try
                            {
				System.out.println("-------------------");
                                System.out.println("Tambah Penyedia");
				System.out.print("Input ID : ");
                                int x1 = input.nextInt();
                                System.out.print("Input Nama : ");
                                String y1 = input.next();
                                addPenyedia(new Penyedia(x1,y1));
                                System.out.println("Berhasil");
                                break;
                            } catch (Exception e){
                                System.out.println("Salah Input Masss");
                            }
                            
                        case 2 :
                                System.out.println("-------------------");
                                System.out.println("Data Penyedia");
                                showAllPenyedia();
                                break;
                        case 3 :
                                System.out.println("-------------------");
                                System.out.println("Hapus Penyedia");
                                System.out.print("Input Indeks Penyedia : ");
                                int x2 = input.nextInt();
                                removePenyedia(x2);
                                System.out.println("Berhasil");
                                break;
                        case 4 :
                                System.out.println("-------------------");
                                System.out.println("Tambah Barang");
                                System.out.print("Input Indeks Penyedia : ");
                                int x3 = input.nextInt();
                                //getPenyedia(x3);
                                System.out.println("ID : "+getPenyedia(x3).getId());
                                System.out.println("Nama : "+getPenyedia(x3).getNama());
                                System.out.print("Masukan ID Barang : ");
                                int y3 = input.nextInt();
                                System.out.print("Masukan Nama Barang : ");
                                String z3 = input.next();
                                System.out.print("Masukan Jumlah Barang : ");
                                int u3 = input.nextInt();
                                getPenyedia(x3).createBarang(new Barang(x3,z3,u3));
                                System.out.println("Berhasil");
                                break;
                        case 5 :
                                System.out.println("-------------------");
                                System.out.print("Input Indeks Penyedia :");
                                int x = input.nextInt();                             
                                getPenyedia(x).showAllBarang();
                                break;        
                        case 6 :
                                System.out.println("-------------------");
				System.out.println("Tambah Petugas");
				System.out.print("Input ID : ");
                                int x6 = input.nextInt();
                                System.out.print("Input Nama : ");
                                String y6 = input.next();
				addPetugas(new Petugas(x6,y6));
                                System.out.println("Berhasil");
                                break;
                        case 7 :
                                System.out.println("-------------------");
                                System.out.println("Data Petugas");
                                showAllPetugas();
                                break;
                        case 8 :
                                System.out.println("-------------------");
                                System.out.println("Hapus Petugas");
                                System.out.print("Input Indeks Petugas : ");
                                int x5 = input.nextInt();
                                removePetugas(x5);
                                System.out.println("Berhasil");
                                break;
                        case 9 :
                                System.out.println("-------------------");
				System.out.println("Tambah Gudang");                              
				System.out.print("Input ID Gudang : ");
                                int y9 = input.nextInt();
                                System.out.print("Input Nama Gudang : ");
                                String z9 = input.next();
                                addGudang(new Gudang(y9,z9));
                                System.out.println("Berhasil");
                                break;                                
                        case 10 :
                                System.out.println("-------------------");
                                System.out.println("Data Gudang");
                                showAllGudang();
                                break;                                
                        case 11 :
                                System.out.println("-------------------");
                                System.out.println("Tambah Barang ke Gudang");
                                System.out.print("Input Indeks Gudang : ");
                                int x11 = input.nextInt();
                                System.out.println("ID : "+getGudang(x11).getId());
                                System.out.println("Nama : "+getGudang(x11).getNama());
                                System.out.print("Input Indeks Penyedia : ");
                                int s11 = input.nextInt();
                                System.out.println("ID : "+getPenyedia(s11).getId());
                                System.out.println("Nama : "+getPenyedia(s11).getNama());
                                getPenyedia(s11).showAllBarang();
                                System.out.print("Input Indeks Barang : ");
                                int t11 = input.nextInt();                                
                                //System.out.println("ID : "+getPenyedia(s11).getBarang(t11).getId());
                                //System.out.println("Nama : "+getPenyedia(s11).getBarang(t11).getNama());
                                //System.out.print("Masukan ID Barang : ");
                                getGudang(x11).addBarang(new Barang(getPenyedia(s11).getBarang(t11).getId(),getPenyedia(s11).getBarang(t11).getNama(),getPenyedia(s11).getBarang(t11).getJml_barang()));
                                getPenyedia(s11).removeBarang(t11);
                                System.out.println("Berhasil dipindahkan ke gudang");                                
                                break;
                        case 12 :
                                System.out.println("-------------------");
                                System.out.print("Input Indeks Gudang : ");
                                int x10 = input.nextInt();                             
                                getGudang(x10).showAllBarangGudang();
                                break;
                        case 0:
                                System.out.println("-------------------");
                                System.out.println("Exited");
                                break;
                        default :
                            System.out.println("-------------------");
                                System.out.println("Pilihan tidak ada");
                                break;
                }
        }
}
