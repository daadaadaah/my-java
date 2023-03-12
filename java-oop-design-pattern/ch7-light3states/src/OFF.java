
public class OFF implements LightState {

	private static LightState instance = new OFF();
	
	public static LightState getInstance() {
		return instance;
	}
	@Override
	public void on_button_pushed(Light light) {
		System.out.println("Light On!!");
		light.setState(ON.getInstance());
	}
	@Override
	public void off_button_pushed(Light light) {
		System.out.println("반응없음");
		light.setState(OFF.getInstance());
	}
}
