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
        System.out.println("Enter a number for the line pattern");
        int line=6,n = input.nextInt();

        System.out.println("Pattern I\tPattern II\tPattern III\tPattern IV");
        for (int i = 1,k=n; i <= n; i++,k--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            
            if(i<=n/2)
                System.out.print("\t\t");
            else
                System.out.print("\t");
            
            for (int j = 1; j <=k; j++) {
                System.out.print(j+" ");
            }
            
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        for(int i = 1;i<=line;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            
            if(i<=line/2)
                System.out.print("\t\t");
            else
                System.out.print( "\t");            

            for(int k=line;k>=i;k--){
                System.out.print(k+" ");
            }
            if(i<=line/2)
                System.out.print("\t");
            else
                System.out.print("\t\t");

            for(int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            
            if(i<=line/2)
                System.out.print("\t\t");
            else
                System.out.print( "\t");

            for(int k=line;k>=i;k--){
                System.out.print(k+" ");
            }
            
            System.out.println();

        }
    }
}
