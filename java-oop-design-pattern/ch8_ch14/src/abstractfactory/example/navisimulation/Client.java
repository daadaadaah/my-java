package abstractfactory.example.navisimulation;

public class Client {
	public static void main(String[] args) {	
		NaviFactory basicNavifactory = new BasicNaviFactory() ;
		NaviFactory testFactory = new NaviTestFactory() ;
		
		GPS gps = testFactory.createGPS() ; 
		Screen mapScreen = testFactory.createMapScreen() ;
		PathFinder pathFinder = basicNavifactory.createPathFinder() ;
		
		Map map = testFactory.createMap() ;
		mapScreen.drawMap(map) ;
		
		Location l1 = gps.findCurrentLocation() ;
		Location l2 = gps.findCurrentLocation() ;
		
		pathFinder.findPath(l1,  l2) ;
	}
}
