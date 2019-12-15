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
//			if(customerReportCondition(customer))	//���ǹ��� ���� ���� �ٸ�
//				selected.add(customer);
//		}
		selected = customerReportCondition(customers);
		
		//String report = String.format("���� %d��\n", customers.size());
		//String report = String.format("**���� %d���Դϴ�**\n", selected.size());
		return generateHeader(selected);
	}
	protected abstract String generateHeader(List<Customer> selected);
	protected abstract List<Customer> customerReportCondition(List<Customer> customers);
	protected  String generateReportBody(List<Customer> selected) {
		String report = "";
		for(Customer customer : selected) {				//�������� ����
			report += getReportForCustomer(customer);	//�޶����� �κ� �Լ���
		}
		return report;
	}
	protected abstract String getReportForCustomer(Customer customer);
	protected abstract String generateReportFooter(List<Customer> selected);
}
