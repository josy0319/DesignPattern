
public class Main {
	public static void main(String[] args) {
		Robot robot = RobotFactory.getRobot(Brand.SAMSUNG);
		robot.clean();
		robot.sweep();
	}
}
