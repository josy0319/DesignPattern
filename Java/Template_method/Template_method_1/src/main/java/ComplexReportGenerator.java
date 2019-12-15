import java.util.ArrayList;
import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {

	@Override
	protected String generateReportFooter(List<Customer> selected) {
		int totalPoint=0;
		for(Customer customer : selected)
			totalPoint += customer.getPoint();
		return String.format("** 점수 합계 : %d **\n",totalPoint);
		//공유되는 부분이 없으므로 그냥 놔둠.
	}

	@Override
	protected String generateHeader(List<Customer> selected) {
		// TODO Auto-generated method stub
		return String.format("** 고객수 %d입니다. **\n ", selected.size());
	}

	@Override
	protected List<Customer> customerReportCondition(List<Customer> customers) {
		// TODO Auto-generated method stub
		List<Customer> s = new ArrayList<Customer>();
		for(Customer c : customers)
			if(c.getPoint() >= 100)
				s.add(c);
		return s;
			
	}

	@Override
	protected String getReportForCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return String.format("%d : %s\n",customer.getPoint(),customer.getName());
	}
}
//나의보고서
//50점이상만
//최고점/최하점

