
public class HansungFactory extends RobotFactory{
	public Robot getRobot() {
		Robot robot= new HansungRobot();
		return robot;
	}
	public String getStr() {
		return "Hansung";
	}
}
