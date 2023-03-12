package command.example.remotecontroller2;

public class RemoteController {
	private Command powerCommand ;
	private Command channelUpCommand ;
	private Command channelDownCommand ;

	public void setPowerCommand(Command powerCommand) {
		this.powerCommand = powerCommand ;
	}
	public void setChannelCommand(Command channelUpCommand, Command channelDownCommand) {
		this.channelUpCommand = channelUpCommand ;
		this.channelDownCommand = channelDownCommand ;	
	}
	public void powerOnOff() {
		powerCommand.execute() ;	
	}
	public void channelUp() {
		channelUpCommand.execute() ;
		
	}
	public void channelDown() {
		channelDownCommand.execute() ;		
	}

}
