
public class ControlRoomDisplay implements Observer{
	ElevatorController controller;
	public ControlRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("ControlRoom : " + curFloor);
	}
}
