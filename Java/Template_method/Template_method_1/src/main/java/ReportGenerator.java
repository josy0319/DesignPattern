import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
	private List<Customer> customers = new ArrayList<Customer>();
	private List<Customer> selected = new ArrayList<Customer>();
	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public String generator() {
		String report;
		report = generateReportHeader(customers);
		report += generateReportBody(selected);
		report += generateReportFooter(selected);
		
		return report;
	}
	protected String generateReportHeader(List<Customer> customers) {
//		for(Customer customer : customers) {
//			if(customerReportCondition(customer))	//조건문이 때에 따라 다름
//				selected.add(customer);
//		}
		selected = customerReportCondition(customers);
		
		//String report = String.format("고객수 %d명\n", customers.size());
		//String report = String.format("**고객수 %d명입니다**\n", selected.size());
		return generateHeader(selected);
	}
	protected abstract String generateHeader(List<Customer> selected);
	protected abstract List<Customer> customerReportCondition(List<Customer> customers);
	protected  String generateReportBody(List<Customer> selected) {
		String report = "";
		for(Customer customer : selected) {				//나머지는 공유
			report += getReportForCustomer(customer);	//달라지는 부분 함수로
		}
		return report;
	}
	protected abstract String getReportForCustomer(Customer customer);
	protected abstract String generateReportFooter(List<Customer> selected);
}
