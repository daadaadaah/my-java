package decorator.before3;

public class Client {
	public static void main(String[] args) {
		RoadDisplay roadWithLandTraffic = new RoadDisplayWithLaneTraffic() ;
		roadWithLandTraffic.draw() ;	
	}

}
