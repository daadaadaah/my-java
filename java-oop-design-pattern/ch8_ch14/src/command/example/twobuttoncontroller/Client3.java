package command.example.twobuttoncontroller;

public class Client3 {
	public static void main(String[] args) {
		TV tv = new TV() ;
		
		TwoButtonController rc = new TwoButtonController() ;
		
		Command powerCommand = new PowerCommand(tv) ;
		Command muteCommand = new MuteCommand(tv) ;
		rc.setCommand(muteCommand, powerCommand) ;	
		
		rc.button1Pressed() ; // No action
		rc.button2Pressed() ; // Power On
		rc.button1Pressed() ; // Mute On
		rc.button1Pressed() ; // Mute Off
		rc.button2Pressed() ; // Power Off
		rc.button1Pressed() ; // No action
	}
}
