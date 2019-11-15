package ticket_machine;

public class Main {

	public static void main(String[] args) {
		Machine machine = Machine.getMachine();
		machine.ticket_print();
		machine.ticket_print();
		machine.ticket_print();
		machine.ticket_print();
		machine.ticket_print();
	}

}
