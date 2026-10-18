package tugaspratikum;
 
import java.io.*;

public class KasirToko {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        DataOutputStream dos = new DataOutputStream(System.out);
        
        try {
            dos.writeBytes("Nama : ");
            dos.flush(); 
            String nama = dis.readLine();
            
            dos.writeBytes("Total Belanja : ");
            dos.flush();
            double totalBelanja = Double.parseDouble(dis.readLine());
            
            dos.writeBytes("Diskon (%) : ");
            dos.flush();
            double diskonPersen = Double.parseDouble(dis.readLine());
            
            double nominalDiskon = totalBelanja * (diskonPersen / 100);
            double total = totalBelanja - nominalDiskon;
            
            dos.writeBytes("Total : " + total + "\n");
            
            dos.writeBytes("Bayar  : ");
            dos.flush();
            double bayar = Double.parseDouble(dis.readLine());
            
            double kembalian = bayar - total;
            
            dos.writeBytes("Kembalian : " + kembalian + "\n");
            dos.flush();
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan pada proses input/output.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Pastikan nilai yang dimasukkan untuk Belanja, Diskon, dan Bayar berupa angka valid.");
        }
    }
}
