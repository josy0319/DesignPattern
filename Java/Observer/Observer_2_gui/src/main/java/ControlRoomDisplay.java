import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//그래픽
public class ControlRoomDisplay implements Observer{
	private ElevatorController controller;
	
	public ControlRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		int currentFloor = controller.getCurFloor();
		System.out.println("Control Room: " + currentFloor);
		String currentFloor_str = String.valueOf(currentFloor);
		
		JFrame frame3 = new JFrame("중앙통제실");
		ImageIcon imageIcon3 = new ImageIcon("image/monitor.png");
		JLabel label5 = new JLabel(imageIcon3);
		JLabel label6 = new JLabel();

		frame3.setBounds(450,100,320,320);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setLayout(null);
		frame3.setVisible(true);

		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 0, 550, 355);
		panel3.setBackground(Color.lightGray);
		panel3.setLayout(null);
		frame3.add(panel3);

		label5.setBounds(0,0,300,300);
		panel3.add(label5);
				
		label6.setBounds(125,80,150,100);
		label6.setText(currentFloor_str+'F');
		label6.setFont(new Font("함초롬돋움", Font.BOLD, 36));
		label6.setForeground(new Color(255,0,0));
		label5.add(label6);	
	}
}
