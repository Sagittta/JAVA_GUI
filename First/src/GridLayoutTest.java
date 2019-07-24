import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("창이름");
		Dimension dim = new Dimension(500, 300);
		frame.setPreferredSize(dim);
		
		JPanel panel = new JPanel();
		GridLayout gl = new GridLayout(2, 5);
		panel.setLayout(gl);
		
		JButton temp;
		for (int i = 0; i < 10; i++) {
			temp = new JButton("Button" + i);
			panel.add(temp);
		}
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
