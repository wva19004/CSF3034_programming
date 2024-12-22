/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author MP3-LECT
 */
public class L9q2 {
    public static void main(String[] args) {
        calculate_kilometre();
    }
    
    public static void calculate_kilometre(){
        // Display the table header
        System.out.println("MPH\t\tKPH");
        System.out.println("--------------------");

        // Display speeds conversion
        System.out.printf("%d\t\t%.2f\n", 60, 60 / 0.6214);
        System.out.printf("%d\t\t%.2f\n", 70, 70 / 0.6214);
        System.out.printf("%d\t\t%.2f\n", 80, 80 / 0.6214);
        System.out.printf("%d\t\t%.2f\n", 90, 90 / 0.6214);
        System.out.printf("%d\t\t%.2f\n", 100, 100 / 0.6214);
        System.out.printf("%d\t\t%.2f\n", 110, 110 / 0.6214);
        System.out.printf("%d\t\t%.2f\n", 120, 120 / 0.6214);
        System.out.printf("%d\t\t%.2f\n", 130, 130 / 0.6214);
    } 
}
