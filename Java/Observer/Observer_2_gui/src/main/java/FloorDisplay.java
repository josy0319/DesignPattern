import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//그래픽
public class FloorDisplay implements Observer{
	private ElevatorController controller;
	
	
	public FloorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	
	public void update() {
		int currentFloor = controller.getCurFloor();
		System.out.println("Floor Display: " + currentFloor);
		String currentFloor_str = String.valueOf(currentFloor);
		
		JFrame frame2 = new JFrame("엘레베이터 외부");		
		ImageIcon imageIcon2 = new ImageIcon("image/elevator2.png");
		JLabel label3 = new JLabel(imageIcon2);
		JLabel label4 = new JLabel();

		frame2.setBounds(200,100,265,500);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLayout(null);
		frame2.setVisible(true);


		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 0, 265, 500);
		panel2.setBackground(Color.lightGray);
		panel2.setLayout(null);;
		frame2.add(panel2);

		label3.setBounds(0,0,250,450);
		panel2.add(label3);
				
		label4.setBounds(118,-58,20,160);
		label4.setText(currentFloor_str+'F');
		label4.setForeground(new Color(255,0,0));
		label4.setBackground(new Color(255,0,0));
		label3.add(label4);
		
		
	}
	
}
