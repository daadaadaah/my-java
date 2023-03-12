package command.example.twobuttoncontroller;

public class PowerCommand implements Command {
	private TV tv ;
	public PowerCommand(TV tv) {
		this.tv = tv ;
	}
	public void execute() {
		tv.power() ;
	}
}
