import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Counter {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");

// 		창 크기 지정
		Dimension dim = new Dimension(500, 300);
// 		창 크기 설정
		frame.setPreferredSize(dim);

//		해상도 구하기
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		double width = res.getWidth();
		double height = res.getHeight();

//		창 위치 지정
//		frame.setLocation((1920-500)/2, (1080-300)/2);
		frame.setLocation(((int) width - 500) / 2, ((int) height - 300) / 2);

		JPanel panel = new JPanel();
		// TODO: 창 내용 배치

		// 텍스트
		JLabel lbId = new JLabel("아이디 : ");
		JTextField tfId = new JTextField(20);
		JLabel lbPw = new JLabel("패스워드 : ");
		JTextField tfPw = new JTextField(20);

		// 라디오
		JLabel lbGender = new JLabel("성별 : ");
		JRadioButton rbFemale = new JRadioButton("여자");
		JRadioButton rbMale = new JRadioButton("남자");
		// 라디오 설정
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbFemale);
		bg.add(rbMale);

		// 체크박스
		JLabel lbMeal = new JLabel("식사 : ");
		JCheckBox cbChicken = new JCheckBox("치킨");
		JCheckBox cbPizza = new JCheckBox("피자");

		// 콤보박스
		JLabel lbEdu = new JLabel("학력 : ");
		String[] edu = { "초졸", "중졸" };
		JComboBox<String> cxEdu = new JComboBox<>(edu);
		// 콤보박스 추가
		cxEdu.addItem("고졸");

		// 버튼
		JButton bts = new JButton("알미~");

		panel.add(lbId);
		panel.add(tfId);
		panel.add(lbPw);
		panel.add(tfPw);

		panel.add(rbFemale);
		panel.add(rbMale);

		panel.add(cbChicken);
		panel.add(cbPizza);

		panel.add(lbEdu);
		panel.add(cxEdu);

		panel.add(bts);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
