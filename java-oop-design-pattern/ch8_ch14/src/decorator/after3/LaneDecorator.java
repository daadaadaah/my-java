package decorator.after3;

public class LaneDecorator extends DisplayDecorator {

	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	public void draw() {
		super.draw();
		drawLane() ;
	}
	private void drawLane() {
		System.out.println("\t차선 표시") ;		
	}
	
}
