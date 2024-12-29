/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author MP3-LECT
 */
public class L10q2 {
    public static void main(String[] args) {
        try{
        File myFile = new File("new_input.txt");
        Scanner scan = new Scanner(myFile);
        
        while(scan.hasNextLine()){
        System.out.println(scan.nextLine());
  
        }
        }catch(FileNotFoundException e){}
    }
}
