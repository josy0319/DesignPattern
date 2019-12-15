
public class SamsungRobot extends Robot{
	private SamsungRobot() { }
	public void clean() {
		System.out.println("hansung clean");
	}
	public void sweep() {
		System.out.println("hansung sweep");
	}
	public static Robot robot;
	public static Robot getInstance() {
		if(robot == null)
			robot = new SamsungRobot();
		else return robot;
		return robot;
	}
}
