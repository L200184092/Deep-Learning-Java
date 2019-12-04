/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jradiobutton;


import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
/**
 *
 * @author MSI
 */
public class Jradiobutton {

    /**
     * @param args the command line arguments
     */
    Jradiobutton() {
        JFrame frame = new JFrame("RadioButton Example Ganno");
        JRadioButton r_male = new JRadioButton("A) Male");
        JRadioButton r_female = new JRadioButton("B) Female");
        r_male.setBounds(15, 50, 100, 30);
        r_female.setBounds(100, 50, 100, 30);
        ButtonGroup btn_grp = new ButtonGroup();
        btn_grp.add(r_male);
        btn_grp.add(r_female);
        frame.add(r_male);
        frame.add(r_female);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Jradiobutton();
    }
    
}
