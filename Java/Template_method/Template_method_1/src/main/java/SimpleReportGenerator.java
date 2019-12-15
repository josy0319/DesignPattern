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
		return String.format("���� %d��\n", selected.size());
	}

	@Override
	protected List<Customer> customerReportCondition(List<Customer> customers) {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	protected String getReportForCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return String.format("%s ����: %d\n",customer.getName(),customer.getPoint());
	}
}
