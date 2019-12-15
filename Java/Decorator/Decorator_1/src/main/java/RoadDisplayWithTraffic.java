
public class RoadDisplayWithTraffic extends DisplayDecorator{
	public RoadDisplayWithTraffic(Display decoratorDisplay) {
		super(decoratorDisplay);
	}
	public void draw() {
		super.draw();
		displayTraffic();
	}
	private void displayTraffic() {
		System.out.println("트래픽 표시");
	}
}
