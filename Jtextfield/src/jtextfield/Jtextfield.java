/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtextfield;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author MSI
 */
public class Jtextfield {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JTextField example Ganno");
        JTextField tf = new JTextField("Text Field Ganno");
        tf.setBounds(50, 150, 200, 30);
        frame.add(tf);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
