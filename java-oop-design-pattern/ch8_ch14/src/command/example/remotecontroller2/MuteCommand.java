package command.example.remotecontroller2;

public class MuteCommand implements Command {
	private TV tv ;
	public MuteCommand(TV tv) {
		this.tv = tv ;
	}
	public void execute() {
		tv.mute() ;
	}
}
