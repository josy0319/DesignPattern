
public class Monitor extends ComputerDevice {
	private int price;
	private int power;
	
	public int getPrice() {
		return price;
	}

	public int getPower() {
		return power;
	}

	public Monitor(int price, int power) {
		this.price = price;
		this.power = power;
	}
}
