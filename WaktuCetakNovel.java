package tugaspratikum;

import java.util.Scanner;

public class WaktuCetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya novel yang akan dicetak: ");
        int jumlahNovel = input.nextInt();
        
        System.out.print("Masukkan tebal lembar per novel : ");
        int lembarPerNovel = input.nextInt();
        
        int totalLembar = jumlahNovel * lembarPerNovel;
        
        int totalDetik = totalLembar;
        
        int hari = totalDetik / 86400;
        int sisaDetikHari = totalDetik % 86400;
        
        int jam = sisaDetikHari / 3600;
        int sisaDetikJam = sisaDetikHari % 3600;
        
        int menit = sisaDetikJam / 60;
        int detik = sisaDetikJam % 60;
        
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total waktu yang diperlukan adalah: " + hari + " hari, " + jam + " jam, " + menit + " menit, dan " + detik + " detik.");
        
        input.close();
    }
}
    

