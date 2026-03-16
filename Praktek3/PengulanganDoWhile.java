/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum12032026;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class PengulanganDoWhile {
        public static void main(String[] args){
            Scanner in =new Scanner (System.in);
            int i,n;
            System.out.print("Masukkan sebuah angka:");
            n=in.nextInt();
            System.out.println("Pengulangan while");
            System.out.println("\nMenampilkan angka 1 sampai "+n);
            i=1;
            do{
                System.out.print(i+"\t");
                i++;
            }while(i<=n);
            
            i=n;
            System.out.println("\nMenampilkan angka dari "+n+" sampai 1");
            do{
                System.out.print(i+"\t");
                i--;
                
            }while(i>=1);
            
          
                
        }
    
}
