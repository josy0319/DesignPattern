
public class Main {
	public static void main(String[] args) {
		Display roadDisplay = new RoadDisplay();
		roadDisplay.draw();
		
		Display roadWithLane = new RoadDisplayWithLane(roadDisplay);
		roadWithLane.draw();
		
		Display roadWithTraffic = new RoadDisplayWithTraffic(roadDisplay);
		roadWithTraffic.draw();
	}
}
