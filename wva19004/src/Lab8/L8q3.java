/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author MP3-LECT
 */
public class L8q3 {
    
    public static void main(String[] args){
    int[] alpha = new int[50];
    
    for(int i=0; i< 25; i++){
        alpha[i] = (int)Math.pow(i,2);
}
    for(int i=25; i<50 ; i++){
        alpha[i] = i*3;
}
    for(int i=0; i<50; i++){
        System.out.print(alpha[i] + " ");
        if((i+1) %10==0){
            System.out.println("");
        }    
}
    }
}
