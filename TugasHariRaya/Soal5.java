/*
 Nama:Alya Septriasa
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        
        System.out.println("masukkan no awal");
        int awal=input.nextInt();
        System.out.println("masukkan no akhir");
        int akhir=input.nextInt();
        
        System.out.println("nomor misi yang bisa membuka portal rahasia");
        
        for(int i = awal; i<= akhir; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.print(i+" ");
            }
        }
    }
    
}
