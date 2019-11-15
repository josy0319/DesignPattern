
public class VoiceNotice implements Observer{
	ElevatorController controller;
	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("VoiceNotice : " + curFloor);
	}
}
