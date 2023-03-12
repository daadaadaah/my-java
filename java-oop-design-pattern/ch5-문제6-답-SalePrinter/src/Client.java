
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Item item1 = new Item("Shampoo", 3000);
		Item item2 = new Item("Cookie", 1000);
		Sale sale = new Sale();
		String expected = "Shampoo3000Cookie1000";
		
		sale.add(item1);
		sale.add(item2);
		
		FakePrinter printer = new FakePrinter();
		sale.setReceiptPrinter(printer);
		sale.printReceipt();
		if (expected.equals(printer.getReceiptContents())) System.out.println("pass!");
		else System.out.println("fail!");
	}

}
