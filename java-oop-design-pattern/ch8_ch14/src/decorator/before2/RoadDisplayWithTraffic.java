package decorator.before2;

public class RoadDisplayWithTraffic extends RoadDisplay {
	public void draw() {
		super.draw();
		drawTraffic();
	}
	private void drawTraffic() {
		System.out.println("교통량 표시") ;
	}
}
