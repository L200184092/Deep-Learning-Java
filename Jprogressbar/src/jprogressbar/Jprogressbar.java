/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jprogressbar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
/**
 *
 * @author MSI
 */
public class Jprogressbar {

    /**
     * @param args the command line arguments
     */
    JProgressBar jprogressbar;
    int progress = 0, num = 0;
    
    Jprogressbar() {
        JFrame frame = new JFrame("JProgressBar Example Ganno");
        jprogressbar = new JProgressBar(0, 2000);
        jprogressbar.setBounds(40, 40, 160, 30);
        jprogressbar.setValue(0);
        jprogressbar.setStringPainted(true);
        frame.add(jprogressbar);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void iterate() {
        while (progress <= 2000) {
            jprogressbar.setValue(progress);
            progress = progress + 10;
            try {
                Thread.sleep(250);
            } catch (Exception e) {
               
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Jprogressbar jpbar = new Jprogressbar();
        jpbar.iterate();
    }
    
}
