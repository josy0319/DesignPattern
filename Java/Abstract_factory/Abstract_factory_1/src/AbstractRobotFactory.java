
public abstract class AbstractRobotFactory {
	public abstract Head getHead();
	public abstract Hand getHand();

	public Robot createRobot() {
		return new Robot();
	}
}
