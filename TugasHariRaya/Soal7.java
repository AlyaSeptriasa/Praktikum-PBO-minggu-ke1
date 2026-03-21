/*
 * Nama:Alya Septriasa
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal7 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        int upahperjam;
        int jamlembur;
        int totalupah;
        
        System.out.println("masukkan jumlah jam lembur");
        jamlembur=input.nextInt();
        
        if(jamlembur > 50){
            System.out.println("tidak ada");
            
        }else{
            if(jamlembur <= 20){
                upahperjam=2000;
            }else{
                upahperjam=3000;
            }
        totalupah=jamlembur * upahperjam;
        
        System.out.println("upahperjam:Rp" + upahperjam);
         System.out.println("totallembur:Rp" + totalupah);
        
        }  
    
    }
    
}
