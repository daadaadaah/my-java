package command.example.remotecontroller2;

public class PowerCommand implements Command {
	private TV tv ;
	public PowerCommand(TV tv) {
		this.tv = tv ;
	}
	public void execute() {
		tv.power() ;
	}
}
