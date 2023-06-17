import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // JlayeredPane - Swing container that provides a third dimension
        //                  for position components ex. depth, Z-index

        // new MyFrame();

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane LayeredPane = new JLayeredPane();
        LayeredPane.setBounds(0, 0, 500, 500);

        // LayeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        // LayeredPane.add(label2, JLayeredPane.DRAG_LAYER);
        // LayeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        // or
        LayeredPane.add(label1, Integer.valueOf(0));
        LayeredPane.add(label2, Integer.valueOf(1));
        LayeredPane.add(label3, Integer.valueOf(1));


        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("JLayeredPane");
        frame.setResizable(false);

        frame.add(LayeredPane);
    }
}
