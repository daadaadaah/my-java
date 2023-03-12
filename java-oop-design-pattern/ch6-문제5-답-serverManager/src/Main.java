
public class Main {
	public static void main(String[] args) {
		
		ServerFactory.setServer(new ServerProvider() {
			public Server getServer() {
				return new FakeServer();
			}
		});
		
		//Server server = ServerFactory.getInstance().getServer();
		
		UseServer use = new UseServer();
		FakeServer server = (FakeServer) use.getServer();
		use.doSomeThing();
	//	assertEquals("invoked", server.getResult());
	//	server.doSomeThing();
	}
}