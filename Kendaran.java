package kendaraan;

public class Kendaraan {
    String nama, jenis, bersuara;
    Kendaraan(String nama, String jenis, String bersuara) {
        this.nama = nama;
        this.jenis = jenis;
        this.bersuara = bersuara;
    }
    
    @Override
    public String toString() {
        return "Tipe motor ini adalah "+jenis+ "\nNama Motor: "+nama+ "\n Suara motornya cocok untuk sunmori:" +" "+bersuara;
    }
    
    public void bersuara(){
    }
}
