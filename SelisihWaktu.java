package tugaspratikum;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Waktu Pertama (HH:MM:SS): ");
        String input1 = sc.nextLine();
        System.out.print("Masukkan Waktu Kedua (HH:MM:SS)  : ");
        String input2 = sc.nextLine();
        
        LocalTime waktu1 = LocalTime.parse(input1);
        LocalTime waktu2 = LocalTime.parse(input2);
        
        Duration selisih = Duration.between(waktu1, waktu2);
        
        long jam = Math.abs(selisih.toHours());
        long menit = Math.abs(selisih.toMinutesPart());
        long detik = Math.abs(selisih.toSecondsPart());
        
        System.out.println("Selisih: " + jam + " Jam, " + menit + " Menit, " + detik + " Detik.");
        
        sc.close();
    }
}    

