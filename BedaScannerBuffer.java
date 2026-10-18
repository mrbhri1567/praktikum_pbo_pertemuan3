
package tugaspratikum;
import java.io.*;
import java.util.Scanner;

public class BedaScannerBuffer {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Angka (Scanner): ");
        int angka1 = sc.nextInt(); 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Angka (BufferedReader): ");
        int angka2 = Integer.parseInt(br.readLine()); 
        
        System.out.println("Total: " + (angka1 + angka2));
        sc.close();
    }
}   

