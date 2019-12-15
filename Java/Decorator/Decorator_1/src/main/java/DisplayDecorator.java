
public abstract class DisplayDecorator extends Display{
	private Display decoratorDisplay; //��� ���� ������ setter and getter
	public DisplayDecorator(Display decoratorDisplay) {
		this.decoratorDisplay = decoratorDisplay; //setter ����
	}
	
	public void draw() {
		decoratorDisplay.draw();
	}
}
