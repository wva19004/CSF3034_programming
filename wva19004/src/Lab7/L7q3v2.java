/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7;

/**
 *
 * @author MP3-LECT
 */
public class L7q3v2 {
    public static void main(String[] args) {
    int n = 6;
    
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = n; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
        
        
        
    }
}
