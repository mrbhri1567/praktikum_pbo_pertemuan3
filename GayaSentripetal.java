
package tugaspratikum;

import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Massa (M): ");
        double m = sc.nextDouble();
        System.out.print("Masukkan Kecepatan (V): ");
        double v = sc.nextDouble();
        System.out.print("Masukkan Jari-jari (r): ");
        double r = sc.nextDouble();
        
        double fc = (m * Math.pow(v, 2)) / r;
        System.out.println("Gaya Sentripetal (Fc) = " + fc);
        
        sc.close();
    }
}
