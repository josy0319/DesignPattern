
public class SamsungFactory extends RobotFactory{
	public Robot getRobot() {
		Robot robot= new SamsungRobot();
		return robot;
	}
	public String getStr() {
		return "Samsung";
	}
}
