
public class Main {

	public static void main(String[] args) {
		MultiButtonController button = new MultiButtonController();
		RobotGunFireCommand gfComm = new RobotGunFireCommand();
		Robot robot = new Robot();
		gfComm.setRobot(robot);
		button.setCommand(gfComm,1);
		
		button.pressed(1);
		button.pressed(1);
		button.pressed(1);
		button.pressed(1);
		
		Car car = new Car();
		CarEngineCommand engineComm = new CarEngineCommand();
		engineComm.setCar(car);
		button.setCommand(engineComm,2);
		
		button.pressed(2);
		button.pressed(2);
		button.pressed(2);
		button.pressed(2);
		
	}
}
