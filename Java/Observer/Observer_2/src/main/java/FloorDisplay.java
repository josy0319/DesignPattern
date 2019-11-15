
public class FloorDisplay implements Observer{
	ElevatorController controller;
	public FloorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("FloorDisplay : " + curFloor);
	}
}
