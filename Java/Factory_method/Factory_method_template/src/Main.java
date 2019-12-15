
public class Main {
	public static void main(String[] args) {
		RobotFactory rf = new HansungFactory();
		rf.cleaning();
		RobotFactory rf2 = new SamsungFactory();
		rf2.cleaning();
	}
}
