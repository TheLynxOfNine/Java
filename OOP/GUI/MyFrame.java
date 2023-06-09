import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        // JFrame frame = new JFrame(); // creates a frame

        this.setSize(1080, 1000); // size of the window x and y
        this.setLayout(null);
        this.setVisible(true); // make frame visible
        this.setTitle("Test Drive"); // title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out off the application
        this.setResizable(false); // stops the window from being resized

        ImageIcon image = new ImageIcon("Makima.jpg"); // create an ImageIcon
        this.setIconImage(image.getImage()); // change icon of fram
        this.getContentPane().setBackground(Color.RED); // change color of background
        this.getContentPane().setBackground(new Color(244,194,194)); // RGB color
        this.getContentPane().setBackground(new Color(0xF4C2C2));
    }
}
