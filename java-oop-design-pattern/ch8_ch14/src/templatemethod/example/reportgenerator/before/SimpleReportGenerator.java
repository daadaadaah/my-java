package templatemethod.example.reportgenerator.before;

import java.util.List;

public class SimpleReportGenerator {
	public String generate(List<Customer> customers) {

		String report = String.format("°í°´ÀÇ ¼ö: %d ¸í\n", customers.size()) ;

		for ( int i = 0 ; i < customers.size() ; i ++ ) {
			Customer customer = customers.get(i) ;
			report += String.format("%s: %d\n", customer.getName(), customer.getPoint()) ;
		}
		return report ;
	}
}
