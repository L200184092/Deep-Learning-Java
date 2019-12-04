/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcombobox;

import javax.swing.JFrame;
import javax.swing.JComboBox;
/**
 *
 * @author MSI
 */
public class Jcombobox {

    /**
     * @param args the command line arguments
     */
    Jcombobox() {
        JFrame frame = new JFrame("JComboBox Example Ganno");
        String language[] = {"Java", "Python", "Android", "PHO", "Swift"};
        JComboBox cb = new JComboBox(language);
        cb.setBounds(50, 50, 90, 30);
        frame.add(cb);
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Jcombobox();
    }
    
}
