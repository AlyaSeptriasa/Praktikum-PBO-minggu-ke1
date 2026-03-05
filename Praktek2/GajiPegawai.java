/*Nama : Alya Septriasa / 2501083007
Deskripsi : Program menghitung gaji bulanan pegawai
Tanggal : 23 Febuari 2026

*/
  package Praktikum05032026;

/**
 *
 * @author alyas
 */
import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args){
        int upahreguler=50000;
        int upahlembur=70000;
        int jamkerjareguler,jamkerjalembur,gajisebulan;
        
        Scanner input = new Scanner(System.in); //input adalah sebuah object dari kelas Scanner
        
        System.out.println("===Program Menghitung Gaji Bulanan Pegawain===");
         System.out.println("\tjam kerja reguler\t=");
         jamkerjareguler=input.nextInt(); //input nilai dengan tipe integer
         System.out.print("\tjam kerja lembur\t=");
         jamkerjalembur=input.nextInt(); //input nilai dengan tipe integer
         gajisebulan=(jamkerjareguler*upahreguler)+(jamkerjalembur*upahlembur); //hitung gaji
         System.out.println("\tgaji pegawai bulan ini\t= "+gajisebulan); // tampilkan gaji
         
         
        
        
        
    }
    
}
