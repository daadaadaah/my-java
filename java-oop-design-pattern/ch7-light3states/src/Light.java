
public class Light {
	private LightState state = OFF.getInstance();
	public void setState(LightState state) {
		this.state = state;
	}
	public void on_button_pushed() {
		state.on_button_pushed(this);
	}
	public void off_button_pushed() {
		state.off_button_pushed(this);
	}
}
