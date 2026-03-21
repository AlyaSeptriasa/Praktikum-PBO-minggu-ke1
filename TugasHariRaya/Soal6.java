/*
 Nama:Alya Septriasa
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal6 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("masukkan umur pnp:");
        int umur=input.nextInt();
        
        if(umur % 10 == 0){
            int dekade = umur / 10;
            System.out.println("dekade pnp ke" + dekade);
        }else
        {
            System.out.println("dies natalis pnp ke" + umur);
        }
    }
}
