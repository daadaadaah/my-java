package decorator.before2;

public class Client {
	public static void main(String[] args) {
		RoadDisplay roadWithTraffic = new RoadDisplayWithTraffic() ;
		roadWithTraffic.draw() ;	
	}
}
