
public class ElevatorDisplay implements Observer{
	ElevatorController controller;
	public ElevatorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("ElevatorDisplay : " + curFloor);
	}
}
