/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

import java.util.Scanner;

/**
 *
 * @author MP3-LECT
 */
public class L9q4 {
    public static void main(String[] args) {
        //read 5 score from user
        int[] score = read_Input();
        //identify the grade for each score
        char[] grade= identify_Grade(score);
        //calculate the average score
        double avg = calculate_Average(score);
        //output - display grade and average
        System.out.println("Subject Grade");
        for (int i = 0; i < score.length; i++) {
            System.out.println("Subject "+(i+1)+": Score is "+score[i]+ ", Grade "+ grade[i]);
        }
        System.out.println("Average score is "+ avg);
        
    }
    
    public static int[] read_Input(){
        int[] scores = new int[5];
        //read from user
        Scanner input = new Scanner(System.in);
        //loop to get 5 score
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter score for subject "+(i+1));
            scores[i] = input.nextInt();
        }
        return scores;
    }
    
    public static char[] identify_Grade(int[] s){
        char[] grade_c = new char[5];
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 80) {
                grade_c[i] = 'A';
            }else if(s[i] >= 70){
                grade_c[i] = 'B';
            }else if(s[i] >= 50){
                grade_c[i] = 'C';
            }else if(s[i] >= 40){
                grade_c[i] = 'D';
            }else{
                grade_c[i] = 'F';
            }
        }
        return grade_c;
    }
    
    public static double calculate_Average(int[] s){
        double average;
        int sum = 0;
        for(int v:s){
            sum = sum + v;
        }
        average = sum/s.length;
        return average;
    }
}
