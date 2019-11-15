
public class Car {
	boolean on = false;
	public void engine() {
		on = !on;
		if(on)
			System.out.println("Engine on...");
		else
			System.out.println("Engine stops");
	}
}
