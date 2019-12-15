
public class RobotFactory {
	public static Robot getRobot(Brand brand) {
		Robot robot = null;
		switch(brand) {
		case HANSUNG:
			robot = HansungRobot.getInstance();
			break;
		case SAMSUNG:
			robot = SamsungRobot.getInstance();
			break;
		}
		return robot;
	}
}
