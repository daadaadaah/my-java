package abstractfactory.example.navisimulation;

public abstract class NaviFactory {
	public abstract GPS createGPS() ;
	public abstract Screen createMapScreen() ;
	public abstract PathFinder createPathFinder() ;
	public abstract Map createMap() ;
}
