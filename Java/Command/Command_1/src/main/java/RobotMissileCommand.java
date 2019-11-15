
public class RobotMissileCommand implements Command {
	private Robot theRobot;
	
	public void setRobot(Robot theRobot) {
		this.theRobot = theRobot;
	}

	public void excute() {
		theRobot.fireMissile();
	}

}
