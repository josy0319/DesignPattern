
public abstract class RobotFactory {
	public void cleaning() {
		Robot robot = getRobot();
		String str = getStr();
		System.out.println("-----"+str+"-----");
		robot.clean();
		robot.sweep();
	}
	public abstract Robot getRobot();
	public abstract String getStr();
}
