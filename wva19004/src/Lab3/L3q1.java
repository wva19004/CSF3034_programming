/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author MP3-LECT
 */
public class L3q1 {
     public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input total working hour:");
        int hour = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Input pay rate per hour:");
        double pay_rate = Double.parseDouble(input);
        
        double gross_pay = hour * pay_rate;
        
        //JOptionPane.showMessageDialog(null, "Total gross pay is "+ gross_pay);
        
        String message = String.format("Total gross pay is %.2f", gross_pay);
        JOptionPane.showMessageDialog(null, message);
        
    }
}
