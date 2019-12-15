
public class Main {
	public static void main(String[] args) {
		RobotStore myStore = new RobotStore();
		
		Brand brand = Brand.valueOf(args[0]);
		
		AbstractRobotFactory factory = null;
		factory = AbstractRobotFactoryFactory.getRobotFactory(brand);
		
		myStore.assemble(factory);
	}
}
