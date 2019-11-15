package Printer;
import java.util.*;

import Printer.PrinterManager.LazyHolder;

public class Printer {
	private static boolean available = true;
	public static boolean isAvailable() {
		return available;
	}
	public void print(String name) {
		try {
			Thread.sleep(new Random().nextInt(100));
			System.out.println(name + "is using "+ this.toString());
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		setAvailable(true);
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public static class LazyHolder{
		private static final Printer INSTANCE1 = new Printer();
		private static final Printer INSTANCE2 = new Printer();
		private static final Printer INSTANCE3 = new Printer();
	}
	
	public static Printer getPrinter1() {
		return LazyHolder.INSTANCE1;
	}
	public static Printer getPrinter2() {
		return LazyHolder.INSTANCE2;
	}
	public static Printer getPrinter3() {
		return LazyHolder.INSTANCE3;
	}
}
