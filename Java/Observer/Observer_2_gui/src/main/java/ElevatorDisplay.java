import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//�׷���
public class ElevatorDisplay implements Observer{
	private ElevatorController controller;
	ImageIcon imageIcon = new ImageIcon("image/elevator.png"); 
	JLabel label = new JLabel(imageIcon);
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	public ElevatorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public JLabel getLabel() {
		return label1;
	}
	public void update() {
		int currentFloor = controller.getCurFloor();
		System.out.println("Elevator Display: " + currentFloor);
		String currentFloor_str = String.valueOf(currentFloor);
		
		JFrame frame = new JFrame("���������� ����");

		frame.setBounds(200,100,550,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
							
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 550, 500);
		panel1.setBackground(Color.lightGray);
		panel1.setLayout(null);;
		frame.add(panel1);
			
		label.setBounds(0,0,550,500);
		panel1.add(label);
				
		label1.setBounds(273,60,100,50);
		label1.setText(currentFloor_str+'F');
		label1.setForeground(new Color(255,0,0));
		label.add(label1);
		
		label2.setBounds(255,73,100,50);	
		label2.setText(currentFloor_str+"�� �Դϴ�.");
		label.add(label2);
				
		frame.setVisible(true);
	}
}
