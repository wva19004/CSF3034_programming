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
public class L10q4 {
    public static void main(String[] args) {
        String[] names = new String[10];
        double[] marks = new double[10];
        char[] grades = new char[10];
        
        try{
        File myFile = new File("student.txt");
        Scanner input = new Scanner(myFile);
        String inputtext;
        String[] part; //Badli 86.00 A,  part[0] = Badli, part[1] = 86.00, part[2]=A
        
        int i =0;
        while(input.hasNextLine()){
            inputtext = input.nextLine();
            part = inputtext.split(" ");
            names[i] = part[0];
            marks[i] = Double.parseDouble(part[1]);
            grades[i]= part[2].charAt(0);
            i++;
        }
        
        for(char value:grades){
            System.out.println(value);
        }
            
        }catch(FileNotFoundException e){System.out.println("File not found");}
        
    }
}
