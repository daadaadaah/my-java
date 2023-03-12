package command.after2;

public class LampOnCommand implements Command {
	private Lamp theLamp;
	public LampOnCommand(Lamp theLamp) {
		this.theLamp = theLamp ;
	}
	public void execute() {
		theLamp.turnOn() ;
	}
}
