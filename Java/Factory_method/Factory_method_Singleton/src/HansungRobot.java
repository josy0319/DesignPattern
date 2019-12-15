
public class HansungRobot extends Robot{
	public void clean() {
		System.out.println("samsung clean");
	}
	public void sweep() {
		System.out.println("samsung sweep");
	}
	public static Robot robot;
	public static Robot getInstance() {
		if(robot == null)
			robot = new HansungRobot();
		else r eturn robot;
		return robot;
	}
}
