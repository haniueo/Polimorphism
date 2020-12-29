package kendaraan;

public class Kawasaki extends Kendaraan {
    private String nama, jenis, bersuara;
    Kawasaki(String nama, String jenis, String bersuara){
        super(nama, jenis, bersuara);
    }
    
    public void ShowHonda(){
        System.out.println("Nama Motor Honda: " +nama);
        System.out.println("Type Motor Honda: " +jenis);
    }
    
    public void bersuara(){
        System.out.println("Brem..Brem..Ora KLX..Ora Tresno");
    }
}
