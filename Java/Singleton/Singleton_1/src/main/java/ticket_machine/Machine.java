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
		System.out.println(i+"�� Ƽ���� �����մϴ�.(0���� ��ȿ���� �ʰ�"
				+ "�� 4�ű��� ���� �� �� �ֽ��ϴ�.)");
		i++;
		}
		else if(i==0){
			System.out.println("��ȿ���� ���� Ƽ���Դϴ�.");
		}
		else {
			System.out.println("�� �̻� Ƽ���� ���� �� �� �����ϴ�.");
		}
	}
}
