package decorator.after2;

public class Client {
	public static void main(String[] args) {		
		Display road = new RoadDisplay() ;
		road.draw() ;
		
		Display roadWithLane = new LaneDecorator(new RoadDisplay()) ;
		roadWithLane.draw() ;
		
		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay()) ;
		roadWithTraffic.draw() ;
			
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay())) ;
		roadWithLaneAndTraffic.draw() ;	
	}
}
