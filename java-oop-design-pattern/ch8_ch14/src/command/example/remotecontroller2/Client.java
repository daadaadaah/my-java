package command.example.remotecontroller2;

public class Client {
	public static void main(String[] args) {
		TV tv = new TV() ;
		Command powerCommand = new PowerCommand(tv) ;
		
		ChannelController channelController = new ChannelController(tv) ;	
		Command channelUpCommand = new ChannelUpCommand(channelController) ;
		Command channelDownCommand = new ChannelDownCommand(channelController) ;
		
		RemoteController rc = new RemoteController() ;
		rc.setPowerCommand(powerCommand) ;
		rc.setChannelCommand(channelUpCommand, channelDownCommand) ;
		
		rc.powerOnOff() ;
		rc.powerOnOff() ;
		rc.powerOnOff() ;
		
		rc.channelUp() ;
		rc.channelDown() ;
	}
}
