package abstractfactory.example.navi;

public class HDScreen extends Screen {
	public void drawMap(Map map) {
		System.out.println("draw map " + map.getClass().getName() + " on HD screen") ;
	}
}
