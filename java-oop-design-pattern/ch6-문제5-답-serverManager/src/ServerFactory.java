
public class ServerFactory implements ServerProvider {
	private static ServerProvider serverProvider = new ServerProvider() {
		public Server getServer() {
			return new RealServer();
		}
	};
	public static ServerProvider getInstance() {
		return serverProvider;
	}
	public Server getServer() {
		return serverProvider.getServer();
	}
	public  static void setServer(ServerProvider sp) {
		serverProvider = sp;
	}	
}
