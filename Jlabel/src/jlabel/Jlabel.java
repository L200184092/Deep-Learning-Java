/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlabel;

import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author MSI
 */
public class Jlabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Label Example Ganno");
        JLabel label = new JLabel("JLabel of Ganno");
        label.setBounds(50, 50, 130, 30);
        
        frame.add(label);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
