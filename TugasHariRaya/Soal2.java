/*
 Nama:Alya Septriasa
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int harga=0;
        double diskon=0;
        
        System.out.println("Masukkan pilihan merek:");
        char merek=input.next().charAt(0);
        
        System.out.println("jumlah yang dibeli:");
        int jumlah=input.nextInt();
        
        if (merek=='X'){
            harga=40000;
            if(jumlah>=3)
             diskon=0.10;
            
        }else if(merek=='Y'){
             harga=50000;
             if(jumlah>3)
             diskon=0.12;
             
        }else if(merek=='Z'){
             harga=60000;
             if(jumlah>=2)
             diskon=0.15;
        }
        
        int total=harga*jumlah;
        double potongan=total*diskon;
        double bayar=total-potongan;
        
        System.out.println("total:"+total);
        System.out.println("diskon:"+potongan);
        System.out.println("bayar:"+bayar);
           
    }
}
