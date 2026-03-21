/*
 * Nama:Alya Septriasa 
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal9 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan ukuran: ");
        int n = input.nextInt();
        
        for (int i = n; i >= 1; i--){
            for (int j = 1; j < i; j++){
                System.out.print("  "); 
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
             System.out.println();
        }        
    }
}
