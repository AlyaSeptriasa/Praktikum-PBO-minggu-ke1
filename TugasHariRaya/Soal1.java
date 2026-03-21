/*
 * Nama:Alya Septriasa

 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int totalhalaman=50,upah=15000;
        
        System.out.println("Masukkan halaman yang sudah selesai");
        int x=input.nextInt();
        
        int uangyangdidapat= x*upah;
        int sisahalaman=totalhalaman-x;
        int sisauang=(totalhalaman-x)*upah;
        
        System.out.println("uangyangdidapat:Rp"+uangyangdidapat);
        System.out.println("sisahalaman:"+sisahalaman);
        System.out.println("sisauang:Rp"+sisauang);
    } 
}
