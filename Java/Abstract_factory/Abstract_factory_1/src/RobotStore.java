
public class RobotStore {
	/*
	public Robot assemble(Brand brand) {
		Robot robot = RobotFactory.createRobot();
		
		Head head = HeadFactory.getHead(brand);
		Body body = BodyFactory.getBody(brand);
		Hand hand = HandFactory.getHand(brand);
		Leg leg = LegFactory.getLeg(brand);
		
		robot.setBody(body);
		robot.setHand(hand);
		robot.setHead(head);
		robot.setLeg(leg);
		
		robot.setBrand(brand);
		return robot;
	}
	//º¯°æ Àü
	*/
	public Robot assemble(AbstractRobotFactory f) {
		Robot robot = f.createRobot();
		
		Head head = f.getHead();
		Hand hand = f.getHand();

		robot.setHand(hand);
		robot.setHead(head);
		
		return robot;
	}
}
