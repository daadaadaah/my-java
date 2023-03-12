package command.example.twobuttoncontroller;

public class MuteCommand implements Command {
	private TV tv ;
	public MuteCommand(TV tv) {
		this.tv = tv ;
	}
	public void execute() {
		tv.mute() ;
	}
}
