/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpasswordfield;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
/**
 *
 * @author MSI
 */
public class Jpasswordfield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JPasswordfield Example Ganno");
        JPasswordField pwd = new JPasswordField();
        JLabel lbl = new JLabel("Enter Password");
        lbl.setBounds(20, 100, 120, 30);
        pwd.setBounds(120, 100, 100, 30);
        frame.add(lbl);
        frame.add(pwd);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
    
}
