import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // JFrame frame = new JFrame(); // creates a frame

        // frame.setSize(1080, 1000); // size of the window x and y
        // frame.setLayout(null);
        // frame.setVisible(true); // make frame visible
        // frame.setTitle("Test Drive"); // title of frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out off the application
        // frame.setResizable(false); // stops the window from being resized

        // ImageIcon image = new ImageIcon("Makima.jpg"); // create an ImageIcon
        // frame.setIconImage(image.getImage()); // change icon of fram
        // frame.getContentPane().setBackground(Color.RED); // change color of background
        // frame.getContentPane().setBackground(new Color(244,194,194)); // RGB color
        // frame.getContentPane().setBackground(new Color(0xF4C2C2));

        MyFrame myFrame = new MyFrame(); // or just new MyFrame();
    }
}
