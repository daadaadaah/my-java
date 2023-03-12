package templatemethod.example.reportgenerator;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {
	protected boolean customerReportCondition(Customer customer) {
		return customer.getPoint() >= 100 ;
	}
	protected String getReportHeader(List<Customer> customers) {
		return String.format("고객의 수: %d 명입니다\n", customers.size()) ;
	}

	protected String getReportForCustomer(Customer customer) {
		return String.format("%d: %s\n", customer.getPoint(), customer.getName()) ;
	}
	protected String getReportFooter(List<Customer> customers) {
		int totalPoint = 0 ;
		for ( Customer customer: customers)
			totalPoint += customer.getPoint() ;
		
		return String.format("점수 합계: %d",  totalPoint) ;	
	}
}
