package ticket_machine;

public class Machine {
	private static int i = 1;
	private Machine() { }
	
	public static class LazyHolder {
		private static final Machine INSTANCE = new Machine();
	}
	public static Machine getMachine() {
		return LazyHolder.INSTANCE;
	}
	public void ticket_print() {
		if(i<5) {
		System.out.println(i+"번 티켓을 발행합니다.(0번은 유효하지 않고"
				+ "총 4매까지 발행 할 수 있습니다.)");
		i++;
		}
		else if(i==0){
			System.out.println("유효하지 않은 티켓입니다.");
		}
		else {
			System.out.println("더 이상 티켓을 발행 할 수 없습니다.");
		}
	}
}
