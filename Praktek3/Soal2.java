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
public class Soal2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,n,r,permutasi,faktorial1,faktorial2;
        System.out.println("Masukkan angka pertama");
        n=input.nextInt();
        System.out.println("Masukkan angka kedua");
        r=input.nextInt();
        
        faktorial1=1;
        faktorial2=1;
        
        for(i=1;i<=n;i++)
        {
            faktorial1=faktorial1 *i;  
        }
        for(i=1;i<=n-r;i++)
        {
            faktorial2=faktorial2 *i;  
        }
        permutasi=faktorial1/faktorial2;
        System.out.println("Nilai permutasi="+permutasi);
            
        
        
    }
    
}
