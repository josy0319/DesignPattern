package Printer;

public class PrinterManager {
	private PrinterManager() { }
	
	public static class LazyHolder{
		private static final PrinterManager INSTANCE = new PrinterManager();
	}
	public static PrinterManager getPrinterManager() {
		return LazyHolder.INSTANCE;
	}
	public static Printer getPrinter() {
		Printer printer1 = Printer.getPrinter1();
		Printer printer2 = Printer.getPrinter2();
		Printer printer3 = Printer.getPrinter3();
		if(printer1.isAvailable()) {
			return printer1;
		}
		else if(printer2.isAvailable()) {
			return printer2;
		}
		else if(printer3.isAvailable()) {
			return printer3;
		}
		else {
			System.out.println("현재 사용할 수 있는 프린터가 없습니다.");
			return null;
		}
	}
}
