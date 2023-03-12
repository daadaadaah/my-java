import junit.framework.TestCase;

public class ServerFactoryTests extends TestCase {
	public void setUp() {
		ServerFactory.setServer(new ServerProvider() {
			public Server getServer() {
				return new FakeServer();
			}
		});
		
	}
	public void testSomething() {
		UseServer use = new UseServer();
		use.doSomeThing();
		FakeServer server = (FakeServer) use.getServer();
		assertEquals("invoked", server.getResult());
	}
}
