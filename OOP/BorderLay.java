import java.awt.*;
import javax.swing.*;

public class Main{

	public static void main(String[] args) {

		// Layout Manager - defines the natural layout for components within a container

		// Border Layout - places components in five areas:
		// 					NORTH, SOUTH, WEST, EAST, CENTER
		//					all extra space is placed in the center area

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout()); // set up the layout
		// frame.setlayout(new Borderlayout(10, 10)); // setting up a margin
		frame.setTitle("Border Layout");
		// frame.setResizable(false);

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.BLUE);
		panel3.setBackground(Color.PINK);
		panel4.setBackground(Color.GREEN);
		panel5.setBackground(Color.ORANGE);

		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));


		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.SOUTH);
		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.WEST);
		frame.add(panel5,BorderLayout.CENTER);

	}
}
