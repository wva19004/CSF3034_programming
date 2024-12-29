/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MP3-LECT
 */
public class L10q1 {
    public static void main(String[] args) {
        File myFile = new File("input.txt");
        //exist
        if(myFile.exists())
            System.out.println("The file existed.");
        else
            System.out.println("File not exist.");
        //length
        System.out.println("File size is "+myFile.length()+" bytes");
        //canRead
        if(myFile.canRead())
            System.out.println("The file can be read.");
        else
            System.out.println("File cannot be read.");
        //lastmodified
        System.out.println("Last modified "+myFile.lastModified());
        Date result = new Date(myFile.lastModified());
        System.out.println(""+ result);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(sdf.format(result));
        
        File newFile = new File("new_input.txt");
        myFile.renameTo(newFile);
    }
    
    
}
