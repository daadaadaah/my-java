package command.example.twobuttoncontroller;

public class TV {
	private boolean powerOn = false ;
	private boolean muteOn = false ;
	private int channel ;
	
	public void power() {
		powerOn = ! powerOn ;
		if ( powerOn )
			System.out.println("Power On") ;
		else
			System.out.println("Power Off") ;		
	}
	
	public void setChannel(int channel) {
		if ( ! powerOn ) return ;
		this.channel = channel ;
		System.out.println("Channel: " + this.channel) ;
	}

	public void mute() {
		if ( ! powerOn ) return ;
		muteOn = ! muteOn ;
		if ( muteOn )
			System.out.println("Mute On") ;
		else
			System.out.println("Mute Off") ;
		
	}

}
