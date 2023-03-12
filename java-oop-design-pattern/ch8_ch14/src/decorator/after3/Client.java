package decorator.after3;

public class Client {
	public static void main(String[] args) {		
		Display roadWithTraffic = new TrafficDecorator(new RoadDisplay()) ;
		roadWithTraffic.draw() ;
			
		Display roadWithLaneAndTraffic = new TrafficDecorator(new LaneDecorator(new RoadDisplay())) ;
		roadWithLaneAndTraffic.draw() ;
		
		Display roadWithCrossingAndTraffic = new TrafficDecorator(new CrossingDecorator(new RoadDisplay())) ;
		roadWithCrossingAndTraffic.draw() ;	
		
		Display roadWithCrossingAndTrafficAndLane = new LaneDecorator(new TrafficDecorator(new CrossingDecorator(new RoadDisplay()))) ;
		roadWithCrossingAndTrafficAndLane.draw() ;	
	}
}
