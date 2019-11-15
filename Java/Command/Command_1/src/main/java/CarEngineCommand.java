
public class CarEngineCommand implements Command {
	private Car theCar;
	
	public void setCar(Car theCar) {
		this.theCar = theCar;
	}

	public void excute() {
		theCar.engine();
	}

}
