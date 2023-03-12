package abstractfactory.example.navi;

public class BasicNaviFactory extends NaviFactory {
	public GPS createGPS() {
		return new CheapGPS() ;
	}
	public Screen createScreen() {
		return new SDScreen() ;
	}
	public PathFinder createPathFinder() {
		return new SlowPathFinder() ;
	}
	public Map createMap() {
		return new SmallMap() ;
	}
}
