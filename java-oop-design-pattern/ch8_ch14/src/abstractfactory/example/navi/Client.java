package abstractfactory.example.navi;

public class Client {
	public static void main(String[] args) {	
		NaviFactory factory = null ;
		String vendorName = args[0] ;
		if ( vendorName.equalsIgnoreCase("Basic") )
			factory = new BasicNaviFactory() ;
		else
			factory = new PremiumNaviFactory() ;
		
		GPS gps = factory.createGPS() ;
		Screen mapScreen = factory.createScreen() ;
		PathFinder pathFinder = factory.createPathFinder() ;
		
		Map map = factory.createMap() ;
		mapScreen.drawMap(map) ;
		
		Location l1 = gps.findCurrentLocation() ;
		Location l2 = gps.findCurrentLocation() ;
		
		pathFinder.findPath(l1,  l2) ;	
	}
}
