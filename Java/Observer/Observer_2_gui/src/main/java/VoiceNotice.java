import javax.swing.JLabel;

//�׷���
public class VoiceNotice implements Observer{
	private ElevatorController controller;
	
	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}
	
	public void update() {
		int currentFloor = controller.getCurFloor();
		System.out.println("Voice Notice: " + currentFloor);
		String currentFloor_str = String.valueOf(currentFloor);
		
		ElevatorDisplay ed = new ElevatorDisplay(controller);
		JLabel label = ed.label;
		
		JLabel label2 = new JLabel();
		label2.setBounds(255,73,100,50);	
		label2.setText(currentFloor_str+"�� �Դϴ�.");
		//ed.label.add(label2);
	}
}
