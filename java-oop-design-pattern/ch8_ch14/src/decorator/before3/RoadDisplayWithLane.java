package decorator.before3;

public class RoadDisplayWithLane extends RoadDisplay {
	public void draw() {
		super.draw();
		drawLane();
	}
	private void drawLane() {
		System.out.println("���� ǥ��") ;
	}

}
