/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlist;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

/**
 *
 * @author MSI
 */
public class Jlist {

    /**
     * @param args the command line arguments
     */
    Jlist() {
        JFrame frame = new JFrame("JList Example Ganno");
        DefaultListModel<String> list_1 = new DefaultListModel<>();
        list_1.addElement("Java");
        list_1.addElement("Python");
        list_1.addElement("Android");
        list_1.addElement("PHP");
        JList<String> list = new JList<>(list_1);
        list.setBounds(100, 100, 75, 75);
        frame.add(list);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Jlist();
    }
    
}
