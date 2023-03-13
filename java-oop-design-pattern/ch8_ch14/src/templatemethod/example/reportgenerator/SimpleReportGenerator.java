package templatemethod.example.reportgenerator;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator {
	protected boolean customerReportCondition(Customer customer) {
		return true ;
	}
	protected String getReportHeader(List<Customer> customers) {
		return String.format("���� ��: %d ��\n", customers.size()) ;
	}
	protected String getReportForCustomer(Customer customer) {
		return String.format("%s: %d\n", customer.getName(), customer.getPoint()) ;
	}
	protected  String getReportFooter(List<Customer> customers) {
		return "" ;
	}
}
