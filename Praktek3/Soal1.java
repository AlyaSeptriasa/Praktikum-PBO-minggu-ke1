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
public class Soal1 {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int i,n,j;
        System.out.print("Masukkan angka:");
        n=input.nextInt();
      
        j=1;
        while(n>10)
        {
            
            System.out.print("Masukkan Angka:");
            n= input.nextInt();
            j=j+1;
        }
        System.out.print("Banyak Angka yang di inputkan user adalah:"+ j);
    }
    
}
