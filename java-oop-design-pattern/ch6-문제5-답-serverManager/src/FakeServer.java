
public class FakeServer implements Server {

	StringBuffer result = new StringBuffer();
	
	@Override
	public void doSomeThing() {
		result.append("invoked");
		System.out.println("invoked");
	}
	public String getResult() {
		return result.toString();
	}
}
