/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author MP3-LECT
 */
public class L2q1 {
    public static void main(String[] args) {
        //initialiazation
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input total working hour:");      
        int working_hour  = scanner.nextInt();        //10 hour
        
        System.out.print("Input rate per hour:");       
        double rate_per_hour  =  scanner.nextDouble();  //rm5.50
        double gross_pay = 0;
        
        //process
        gross_pay = working_hour * rate_per_hour;
        
        //output
        System.out.printf("Total gross pay is %.2f", gross_pay);
        System.out.println("");
        
                
                
    }
}
