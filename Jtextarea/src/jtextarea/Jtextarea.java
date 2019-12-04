/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtextarea;

import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 *
 * @author MSI
 */
public class Jtextarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("TextArea Example Ganno");
        JTextArea ja = new JTextArea("Welcome Ganno. Nice To Meet You");
        ja.setBounds(10, 30, 200, 200);
        frame.add(ja);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
