package command.example.twobuttoncontroller;

public class Client2 {
	public static void main(String[] args) {
		TV tv = new TV() ;
		
		TwoButtonController rc = new TwoButtonController() ;
		
		Command powerCommand = new PowerCommand(tv) ;
		rc.setCommand(powerCommand, powerCommand) ;
		
		rc.button1Pressed() ; // Power On
		rc.button2Pressed() ; // Power Off
		rc.button1Pressed() ; // Power On
		rc.button1Pressed() ; // Power Off
		rc.button2Pressed() ; // Power On
		rc.button1Pressed() ; // Power Off
	}
}
