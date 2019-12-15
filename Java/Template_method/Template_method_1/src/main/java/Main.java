
public class Main {
	public static void main(String[] args) {
		ReportGenerator simpleGenerator = new SimpleReportGenerator();
		Customer customer1 = new Customer("°í°´1",10);
		Customer customer2 = new Customer("°í°´2",100);
		Customer customer3 = new Customer("°í°´3",150);
		
		simpleGenerator.add(customer1);
		simpleGenerator.add(customer2);
		simpleGenerator.add(customer3);
		
		System.out.println(simpleGenerator.generator());
		
		ReportGenerator complexGenerator = new ComplexReportGenerator();
		
		complexGenerator.add(customer1);
		complexGenerator.add(customer2);
		complexGenerator.add(customer3);
	
		System.out.println(complexGenerator.generator());
	
//		ReportGenerator myGenerator = new MyReportGenerator();
//		
//		myGenerator.add(customer1);
//		myGenerator.add(customer2);
//		myGenerator.add(customer3);
	
		//System.out.println(myGenerator.generator());
	}
}
