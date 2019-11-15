
public class RobotGunFireCommand implements Command {
	private Robot theRobot;
	
	public void setRobot(Robot theRobot) {
		this.theRobot = theRobot;
	}

	public void excute() {
		theRobot.fireGun();
	}

}
