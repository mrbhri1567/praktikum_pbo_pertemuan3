package tugaspratikum;

import java.io.*;

public class HitungBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("--- Perhitungan Total Buah ---");
        int manggaBeli = 70;
        int manggaBusuk = 15;
        int manggaBagus = manggaBeli - manggaBusuk;
        
        int jumlahTetangga = 4;
        int jambuPerTetangga = 30;
        int totalJambu = jumlahTetangga * jambuPerTetangga;
        
        int totalKeseluruhan = manggaBagus + totalJambu;
        
        System.out.println("Total Mangga yang bagus : " + manggaBagus + " pcs");
        System.out.println("Total Jambu untuk warga : " + totalJambu + " pcs");
        System.out.println("Total buah keseluruhan  : " + totalKeseluruhan + " pcs");
        
        System.out.print("\nTekan Enter untuk keluar...");
        br.readLine();
    }
}

