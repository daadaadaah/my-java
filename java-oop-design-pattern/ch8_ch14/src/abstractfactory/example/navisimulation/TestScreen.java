package abstractfactory.example.navisimulation;

public class TestScreen extends Screen {
	public void drawMap(Map map) {
		System.out.println("draw map " + map.getClass().getName() + " on Test screen") ;
	}
}
