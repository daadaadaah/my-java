
public class UseServer {
	private Server server;
		
	public Server getServer() {
		return server;
	}
	public void doSomeThing() {
		ServerProvider factory = ServerFactory.getInstance();
		server = factory.getServer();
		server.doSomeThing();
	}
}
