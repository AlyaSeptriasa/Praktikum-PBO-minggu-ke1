/*
 * Nama:Alya Septriasa
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal8 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int n=5;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1) {
                    System.out.print("0 ");
                } 
                else if (i == j) {
                    System.out.print("0 ");
                } 
                else {
                    System.out.print("x ");
                }

            }
            System.out.println();
        }
    }
}
        
