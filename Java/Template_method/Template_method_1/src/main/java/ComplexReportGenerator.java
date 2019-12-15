import java.util.ArrayList;
import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {

	@Override
	protected String generateReportFooter(List<Customer> selected) {
		int totalPoint=0;
		for(Customer customer : selected)
			totalPoint += customer.getPoint();
		return String.format("** ���� �հ� : %d **\n",totalPoint);
		//�����Ǵ� �κ��� �����Ƿ� �׳� ����.
	}

	@Override
	protected String generateHeader(List<Customer> selected) {
		// TODO Auto-generated method stub
		return String.format("** ���� %d�Դϴ�. **\n ", selected.size());
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
//���Ǻ���
//50���̻�
//�ְ���/������

