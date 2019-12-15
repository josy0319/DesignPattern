
public class RoadDisplayWithCrossing extends DisplayDecorator{
	public RoadDisplayWithCrossing(Display decoratorDisplay) {
		super(decoratorDisplay);
	}
	public void draw() {
		super.draw();
		displayTraffic();
	}
	private void displayTraffic() {
		System.out.println("교차로 표시");
	}
}
