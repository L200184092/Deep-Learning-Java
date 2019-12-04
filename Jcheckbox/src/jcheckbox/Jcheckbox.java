/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcheckbox;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author MSI
 */
public class Jcheckbox {

    /**
     * @param args the command line arguments
     */
    Jcheckbox() {
        JFrame frame = new JFrame("CheckBox Example Ganno");
        JCheckBox ch_swing = new JCheckBox("Swing");
        ch_swing.setBounds(100, 100, 80, 50);
        JCheckBox ch_awt = new JCheckBox("AWT", true);
        ch_awt.setBounds(100, 150, 80, 50);
        frame.add(ch_swing);
        frame.add(ch_awt);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Jcheckbox();
    }
    
}
