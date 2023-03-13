package decorator.after2;

public class TrafficDecorator extends DisplayDecorator {
	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}
	public void draw() {
		super.draw();
		drawTraffic() ;
	}
	private void drawTraffic() {
		System.out.println("\t���뷮 ǥ��") ;		
	}	
}
