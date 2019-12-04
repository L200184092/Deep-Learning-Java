/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanel;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

/**
 *
 * @author MSI
 */
public class Jpanel {

    /**
     * @param args the command line arguments
     */
    Jpanel() {
        JFrame frame = new JFrame("JPanel Example Ganno");
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        JButton btn = new JButton("JPanel Button");
        btn.setBounds(50, 200, 80, 30);
        btn.setBackground(Color.ORANGE);
        
        panel.add(btn);
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       new Jpanel();
    }
    
}
