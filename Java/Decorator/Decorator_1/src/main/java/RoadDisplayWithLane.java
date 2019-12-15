
public class RoadDisplayWithLane extends DisplayDecorator{
	
	public RoadDisplayWithLane(Display decoratorDisplay) {
		super(decoratorDisplay);
	}
	public void draw() {
		super.draw();
		displayLane();
	}
	private void displayLane() {
		System.out.println("차선 표시");
	}
}
