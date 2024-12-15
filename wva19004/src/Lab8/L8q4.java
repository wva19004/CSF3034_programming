/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author MP3-LECT
 */
public class L8q4 {
    
    public static void main(String[] args){
        int[][] student = {{1,78,90,40,75},{2,90,83,75,68},
            {3,40,80,53,69}};
        for(int i=0;i< student.length; i++){
            int studentID = student[i][0];
            int studentMarks = 0;
            
            for(int j=1; j < student[i].length; j++){
                studentMarks = studentMarks + student[i][j];
            }
            
            System.out.println("Student ID:"+ studentID + " Marks:"+studentMarks);
        }
    }
    
}
