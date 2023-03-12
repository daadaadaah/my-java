
public class FakePrinter implements ReceiptPrinter {
	String s;	
	@Override
	public void print(String s) {
		this.s = s;
	}
	
	public String getReceiptContents() {
		return s;
	}
}
