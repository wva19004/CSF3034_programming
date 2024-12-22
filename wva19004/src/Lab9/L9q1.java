/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author MP3-LECT
 */
public class L9q1 {
    public static void main(String[] args){
       double[] sales = {20000.30,15008.90,12584.10,87543.00,28791.30};
       displayCal(sales);
       System.out.println("Maximum sale is:"+ max(sales));
       displayArray(sales);
    }
    
    public static void displayCal(double[] s){
        
        System.out.println("SALES\t\tCEIL\t\tFLOOR\t\tSQUARE ROOT\tRADIAN");
        
        for(int i=0;i<s.length;i++){
        
        System.out.printf("%.2f\t",s[i]);
        System.out.printf("%.2f\t",ceil(s[i]));
        System.out.printf("%.2f\t",floor(s[i]));
        System.out.printf("%.2f\t\t",sroot(s[i]));
        System.out.printf("%.2f",radian(s[i]));
        System.out.println("");
        }
    }
    
    public static double ceil(double s){
        return Math.ceil(s);
    }
    public static double floor(double s){
        return Math.floor(s);
    }
    public static double sroot(double s){
        return Math.sqrt(s);
    }
    public static double radian(double s){
        return Math.toRadians(s);
    }
    public static double max(double[] s){
        double maximum = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i]> maximum){
                maximum = s[i];
            }
        }
        return maximum;
    }
    
    public static void displayArray(double[] s){
        for (double value:s) {
            System.out.println(value);
        }
    }
}
