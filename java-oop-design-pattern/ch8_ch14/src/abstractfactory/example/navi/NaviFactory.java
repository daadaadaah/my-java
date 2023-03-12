package abstractfactory.example.navi;

public abstract class NaviFactory {
	public abstract GPS createGPS() ;
	public abstract Screen createScreen() ;
	public abstract PathFinder createPathFinder() ;
	public abstract Map createMap() ;
}
