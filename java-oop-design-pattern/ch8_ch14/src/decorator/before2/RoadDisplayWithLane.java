package decorator.before2;

public class RoadDisplayWithLane extends RoadDisplay {
	public void draw() {
		super.draw();
		System.out.println("차선 표시") ;
	}


}
