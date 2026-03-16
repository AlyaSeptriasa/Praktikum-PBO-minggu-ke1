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
public class PengulanganFor {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int i,n;
        System.out.print("Masukkan sebuah bilangan:");
        n=input.nextInt();
        System.out.println("Pengulangan dari 1 sampai"+n);
        for(i=1;i<=n;i++)
        {
            System.out.print(i+"\t");
        }
        System.out.println("\npengulangan dari "+n+" sampai 1");
        for(i=n;i>=1;i--)
        {
            System.out.print(i+"\t");
        }
    }
    
    
}
