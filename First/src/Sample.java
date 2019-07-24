import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sample {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		
		JPanel panel = new JPanel();
		//TODO: 창 내용 배치
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
