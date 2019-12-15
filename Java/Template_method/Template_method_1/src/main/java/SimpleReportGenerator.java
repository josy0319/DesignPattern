import java.util.ArrayList;
import java.util.List;

public class SimpleReportGenerator extends ReportGenerator {
	@Override
	protected String generateReportFooter(List<Customer> customers) {
		
		return "";
	}

	@Override
	protected String generateHeader(List<Customer> selected) {
		// TODO Auto-generated method stub
		return String.format("고객수 %d명\n", selected.size());
	}

	@Override
	protected List<Customer> customerReportCondition(List<Customer> customers) {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	protected String getReportForCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return String.format("%s 점수: %d\n",customer.getName(),customer.getPoint());
	}
}
