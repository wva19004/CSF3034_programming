/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

import java.util.Scanner;

/**
 *
 * @author onewa
 */
public class L7q3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean con = true;
        do{
            System.out.println("Enter a number for the line pattern");
            int n= input.nextInt();
            char space = ' ';

            if(n<1)
                break;
            System.out.printf("\nPattern I%-" + (n+1) + "sPattern II%-" + (n+1) + "sPattern III%-" + (n+1) + "sPattern IV\n",space,space,space);
            for (int i = 1,k=n,p=n; i <= n; i++,k--,p-=2) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.printf("%-" + (p+8) + "s", space); 

                for (int j = 1; j <=k; j++) {
                    System.out.print(j+" ");
                }
                System.out.printf("%-" + (n+8) + "s", space);
                
                for (int j = i; j > 0; j--) {
                    System.out.print(j+" ");
                }
                System.out.printf("%-" + (p+8) + "s", space); 

                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println("");
            }
        }while(con);
    }
}
