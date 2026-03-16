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
public class Soal3 {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
            int i,n,j,x;
            System.out.println("Masukkan Angka Pertama");
            n=input.nextInt();
            System.out.println("Masukkan Angka kedua");
           x=input.nextInt();
                 
            for(i=1;i<=n;i++){
                for(j=1; j<=x; j++){
                    
                    System.out.print("*");
                } 
                System.out.println();
            }
    }
    
}
