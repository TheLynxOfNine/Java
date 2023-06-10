import java.util.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon image = new ImageIcon("Makima.jpg");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        // label.setVerticalAlignment(JLabel.BOTTOM);
        // label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 75, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        bluePanel.add(label); // related to the label set bounds
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
