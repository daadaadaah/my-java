package decorator.before3;

public class RoadDisplayWithLaneTraffic extends RoadDisplay {
	public void draw() {
		super.draw();
		drawLane();
		drawTraffic();
	}
	private void drawTraffic() {
		System.out.println("���뷮 ǥ��") ;
	}

	private void drawLane() {
		System.out.println("���� ǥ��") ;
	}
}
