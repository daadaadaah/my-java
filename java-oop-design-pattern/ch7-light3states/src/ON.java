
public class ON implements LightState {
	private static LightState instance = new ON();
	
	public static LightState getInstance() {
		return instance;
	}

	@Override
	public void on_button_pushed(Light light) {
		System.out.println("취침등 상태");
		light.setState(SLEEPING.getInstance());
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light off!!");
		light.setState(OFF.getInstance());
	}

}
