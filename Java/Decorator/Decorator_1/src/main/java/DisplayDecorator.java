
public abstract class DisplayDecorator extends Display{
	private Display decoratorDisplay; //멤버 변수 있으면 setter and getter
	public DisplayDecorator(Display decoratorDisplay) {
		this.decoratorDisplay = decoratorDisplay; //setter 역할
	}
	
	public void draw() {
		decoratorDisplay.draw();
	}
}
