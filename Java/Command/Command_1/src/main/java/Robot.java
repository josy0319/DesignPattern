
public class Robot {
	boolean gun = false;
	boolean missile = false;
	
	public void fireGun() {
		gun = !gun;
		if(gun)
			System.out.println("Gun Fires...");
		else
			System.out.println("Gun Fire stops");
	}
	
	public void fireMissile() {
		missile = !missile;
		if(missile)
			System.out.println("Missile...");
		else
			System.out.println("Missile stops");
	}
}
