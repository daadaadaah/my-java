package decorator.before3;

public class RoadDisplayWithTraffic extends RoadDisplay {
	public void draw() {
		super.draw();
		drawTraffic();
	}
	private void drawTraffic() {
		System.out.println("���뷮 ǥ��") ;
	}
}
