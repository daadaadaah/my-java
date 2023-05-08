package templatemethod.example.reportgenerator;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>() ;
		
		customers.add(new Customer("ȫ�浿", 150)) ;
		customers.add(new Customer("�����", 350)) ;
		customers.add(new Customer("������", 50)) ;
		customers.add(new Customer("�Ǹ���", 450)) ;
		customers.add(new Customer("�ְ���", 550)) ;

		ReportGenerator simpleGenerator = new SimpleReportGenerator() ;
		System.out.println(simpleGenerator.generate(customers)) ;
		
		ReportGenerator complexGenerator = new ComplexReportGenerator() ;
		System.out.println(complexGenerator.generate(customers)) ;
	}
}
