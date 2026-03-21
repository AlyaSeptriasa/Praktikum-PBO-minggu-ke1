/*
 Nama:Alya Septriasa
 */
package TugasHariRayaPbo;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        int angka;
        
        System.out.println("Masukkan bil genap");
        angka=input.nextInt();
        
        while(angka % 2 !=0){
            System.out.println("bilangan yang dimasukkan ganjil");
            System.out.println("masukkan lagi bilngan genap");
            angka=input.nextInt();  
        }
        angka=angka + 1;
        System.out.println("hasil ditambahkan 1:" + angka);
        
        
    }
    
}
