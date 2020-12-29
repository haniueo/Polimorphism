package kendaraan;

public class Honda extends Kendaraan {
    private String nama, jenis, bersuara;
    Honda(String nama, String jenis, String bersuara){
        super(nama, jenis, bersuara);
    }
    
    public void ShowHonda(){
        System.out.println("Nama Motor Honda: " +nama);
        System.out.println("Type Motor Honda: " +jenis);
    }
    
    public void bersuara(){
        System.out.println("Mberrrrr..Mberr..Ora Beat ora Gebet");
    }
}
