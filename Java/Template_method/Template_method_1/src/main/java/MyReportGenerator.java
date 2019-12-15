import java.util.List;

public class MyReportGenerator extends ReportGenerator{

	@Override
	protected String generateHeader(List<Customer> selected) {
		// TODO Auto-generated method stub
		return String.format("나의 보고서 %d명\n", selected.size());
	}

	@Override
	protected List<Customer> customerReportCondition(List<Customer> selectedCustomer) {
		// TODO Auto-generated method stub
		return selectedCustomer;
	}

	@Override
	protected String getReportForCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return String.format("*** %s : %d\n", customer.getName(),customer.getPoint());
	}

	@Override
	protected String generateReportFooter(List<Customer> selected) {
		int min=1001;
		int max=0;
		Customer minCustomer=null, maxCustomer=null;
		for(Customer customer : selected) {
			if(customer.getPoint()>max) {
				maxCustomer = customer;
				max = maxCustomer.getPoint();
			}
			if(customer.getPoint()<min) {
				minCustomer = customer;
				min = minCustomer.getPoint();
			}
		}
		return String.format("*** 최고점:%s 최하점:%s\n", maxCustomer.getName(),minCustomer.getName());
	}

}
