/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microwave;

import javax.swing.*;
import java.awt.*;

public class Microwave extends JFrame {
    // Leftside of interface
    JButton bigBtn = new JButton("Food to be placed here");
    
    // Rightside of interface
    JPanel rightPanel = new JPanel();
    JLabel timeLabel = new JLabel("Time to be displayed here");
    // 12buttons
    JPanel btnPanel = new JPanel(); 
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");
    JButton btnStart = new JButton("Start");
    JButton btnStop = new JButton("Stop");
    

    public Microwave(String title) {
        super(title);
        setVisible(true);
        setSize(500, 300);

        // Set layout of frame
        setLayout(new GridLayout(1, 2));
        
        // Adding a component into the frame
        add(bigBtn);
        add(rightPanel);
        
        // rightPanel
        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(timeLabel, BorderLayout.NORTH);
        rightPanel.add(btnPanel, BorderLayout.CENTER);

        btnPanel.setLayout(new GridLayout(4, 3)); //btnPanel
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btnPanel.add(btn3);
        btnPanel.add(btn4);
        btnPanel.add(btn5);
        btnPanel.add(btn6);
        btnPanel.add(btn7);
        btnPanel.add(btn8);
        btnPanel.add(btn9);
        btnPanel.add(btn0);
        btnPanel.add(btnStart);
        btnPanel.add(btnStop);
    }
}