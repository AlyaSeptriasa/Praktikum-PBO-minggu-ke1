/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum05032026;

/**
 *
 * @author alyas
 */
import java.util.Scanner;
public class Max2 {
    public static void main(String[] args){
        int a,b,max;
        Scanner in= new Scanner(System.in);
        System.out.println("===Program Menentukan Bilangan Terbesar===");
        System.out.print("Bilangan 1=");
        a=in.nextInt();
        System.out.print("Bilangan 2=");
        b=in.nextInt();
        if (a>b)
           max = a;
         else  //(a<b)
           max = b;
           //endif
           System.out.println(max + "merupakan bilangan terbesar");
              
    }
    
}
