package abstractfactory.example.navi;

public class SDScreen extends Screen {
	public void drawMap(Map map) {
		System.out.println("draw map " + map.getClass().getName() + " on SD screen") ;
	}
}
