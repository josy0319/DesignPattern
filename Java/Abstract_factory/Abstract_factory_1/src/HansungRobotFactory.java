
public class HansungRobotFactory extends AbstractRobotFactory {
	private static HansungRobotFactory factory;
	private HansungRobotFactory() {
		
	}
	public static AbstractRobotFactory getInstance() {
		if(factory == null) factory = new HansungRobotFactory();
		return factory;
	}
	public Head getHead() {
		// TODO Auto-generated method stub
		return new HansungHead();
	}

	public Hand getHand() {
		// TODO Auto-generated method stub
		return new HansungHand();
	}

}
