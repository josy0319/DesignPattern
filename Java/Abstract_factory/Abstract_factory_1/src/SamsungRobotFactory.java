
public class SamsungRobotFactory extends AbstractRobotFactory {
	private static SamsungRobotFactory factory;
	private SamsungRobotFactory() {
		
	}
	public static SamsungRobotFactory getInstance() {
		if(factory == null) factory = new SamsungRobotFactory();
		return factory;
	}
	
	public Head getHead() {
		// TODO Auto-generated method stub
		return new SamsungHead();
	}

	public Hand getHand() {
		// TODO Auto-generated method stub
		return new SamsungHand();
	}
}
