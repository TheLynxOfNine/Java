import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       // JLabel = a GUI display area for a string of text, an image or both

       ImageIcon image = new ImageIcon("Makima.jpg");
       Border border = BorderFactory.createLineBorder(Color.green,3);

       JLabel label = new JLabel(); // create a label
       label.setText("Makima the Control Devil"); // set text of label
       label.setIcon(image);
       label.setHorizontalTextPosition(JLabel.CENTER);
       label.setVerticalTextPosition(JLabel.TOP);
       label.setForeground(Color.PINK); // set font color of text
       label.setFont(new Font("MV Boli", Font.PLAIN,20)); // set font of text
       label.setBackground(Color.BLACK);
       label.setOpaque(true); // display background color
       label.setIconTextGap(2); // set gap of text to image
       label.setBorder(border);
       label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
       label.setHorizontalAlignment(JLabel.CENTER); // set horizontal pos of icon+text w/in label
       // label.setBounds(100, 100, 500, 500); // set x and y pos w/in frame as well as dimensions


       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(900,900);
       frame.setVisible(true);
       frame.add(label);
       // frame.setLayout(null);
       frame.pack();


    }
}
