/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbutton;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author MSI
 */
public class Jbutton{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jf = new JFrame("Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(50, 100, 150, 20);
        
        JButton jb = new JButton("Click");
        jb.setBounds(50, 50, 95, 30);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Ganno");
            }
        });
        jf.add(jb);
        jf.add(tf);
        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setVisible(true);
        
    }
    
}
