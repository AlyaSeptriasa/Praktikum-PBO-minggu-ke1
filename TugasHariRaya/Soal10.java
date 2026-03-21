/*
 * Nama:Alya Septriasa
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal10 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
         int tujuan, kls, jml;
        int harga = 0;
        double diskon = 0, total, bayar;

        System.out.println("pilih tujuan:");
        System.out.println("1. jakarta");
        System.out.println("2. yogya");
        System.out.println("3. surabaya");
        System.out.print("Masukkan tujuan: ");
        tujuan = input.nextInt();

        System.out.println("\npilih kelas:");
        System.out.println("1. eksekutif");
        System.out.println("2. bisnis");
        System.out.println("3. ekonomi");
        System.out.print("Masukkan kelas: ");
        kls = input.nextInt();

        System.out.print("\nJumlah tiket: ");
        jml = input.nextInt();

        if (tujuan == 1) // Jakarta
        { 
            if (kls == 1) harga = 70000;
            else if (kls == 2) harga = 40000;
            else if (kls == 3) harga = 10000;
        } 
        else if (tujuan == 2) // Yogya
        { 
            if (kls == 1) harga = 80000;
            else if (kls == 2) harga = 50000;
            else if (kls == 3) harga = 20000;
        } 
        else if (tujuan == 3) // Surabaya
        { 
            if (kls == 1) harga = 90000;
            else if (kls == 2) harga = 60000;
            else if (kls == 3) harga = 30000;
        }

        total = harga * jml;

        if ((tujuan == 3 && kls == 1 && jml >= 4) ||
            (tujuan == 2 && kls == 3 && jml >= 4))
        {
            diskon = total * 0.10;
        }

        bayar = total - diskon;

        System.out.println("Harga tiket      : " + harga);
        System.out.println("Total harga      : " + total);
        System.out.println("Diskon           : " + diskon);
        System.out.println("Total pembayaran : " + bayar);
        
    }    
    
}
