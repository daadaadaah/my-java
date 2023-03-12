package decorator.before3;

public class RoadDisplayWithLaneTraffic extends RoadDisplay {
	public void draw() {
		super.draw();
		drawLane();
		drawTraffic();
	}
	private void drawTraffic() {
		System.out.println("교통량 표시") ;
	}

	private void drawLane() {
		System.out.println("차선 표시") ;
	}
}
