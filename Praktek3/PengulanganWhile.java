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
public class PengulanganWhile {
    public static void main(String[]args){
       Scanner in = new Scanner (System.in);
        int i,n;
        System.out.print("Masukkan sebuah angka:");
        n=in.nextInt();
        System.out.println("Pengulangan while");
        System.out.println("Menampilkan angka 1 sampai "+n);
        i=1;
        while(i<=n){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println("\nMenampilkan angka dari "+n+" sampai 1");
        i=n;
        while(i>=1){
            System.out.print(i+"\t");
            i--;
        }
        
        
    }
    
    
}
