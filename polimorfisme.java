package kendaraan;

import java.util.*;

public class polimorfisme {
    public static void main(String[] args){
        Kendaraan[] motornya = {
        new Honda("Beat", "Beat Street 125cc", "Mberrrrr..Mberr..Ora Beat ora Gebet"),
            new Kawasaki("KLX", "Kawasaki KLX 250", "Brem..Brem..Ora KLX..Ora Tresno"),
            new Vespa("Vespa Matic", "Vespa Matic S 150cc", "Ngeeeeeng..ngengg..Ora Vespa Ora Cinta")
    };
        Kendaraan pilihKendaraan;
        Random pilih = new Random();
        for (int i = 0; i < 2; i++) {
            pilihKendaraan = motornya[pilih.nextInt(motornya.length)];
            System.out.println("\nPilihan Anda: \n" +pilihKendaraan);
        }
    }
}
