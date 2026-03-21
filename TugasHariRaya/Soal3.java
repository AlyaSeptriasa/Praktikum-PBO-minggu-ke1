/*
 * Nama:Alya Septriasa
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args){
       Scanner input= new Scanner (System.in);
       int jml=0;
       int total=0;
       
       System.out.println("Masukkan batas awal:");
       int awal=input.nextInt();
       
       System.out.println("Masukkan batas akhir:");
       int akhir=input.nextInt();
       
       System.out.println(" kelipatan 11 yang ganjil");
       
       for(int i= awal; i <= akhir; i++){
           if(i%11==0 && i%2 !=0){
               System.out.print(i+" ");
               jml++;
               total += i;
           }
       }
       System.out.println("\njumlah deret="+total);
       
       if(jml>0){
           double rata=(double) total/jml;
           System.out.println("rata-rata="+rata);
       }else
       {
           System.out.println("tidak ada");
       }       
              
    }
    
}
