import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame /*implements ActionListener*/ {

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Flow Layout");
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10)); // stays on the left DEFAULT IS CENTER + 0,0 horizontal and vertical spacing
        this.setResizable(false);

        JPanel panel = new JPanel();

        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(Color.GRAY);
        panel.setLayout(new FlowLayout()); // adds all the button to the panel

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        this.add(panel); // adds the panel to the frame
        this.setVisible(true);
    }
}
