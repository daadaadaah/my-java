package command.example.remotecontroller2;

public class TV {
	private boolean powerOn = false ;
	private boolean mute = false ;
	
	private int channel ;
	public void power() {
		powerOn = ! powerOn ;
		if ( powerOn )
			System.out.println("Power On") ;
		else
			System.out.println("Power Off") ;		
	}
	
	public void setChannel(int channel) {
		this.channel = channel ;
		System.out.println("Channel: " + this.channel) ;
	}

	public void mute() {
		mute = ! mute ;
		if ( mute )
			System.out.println("Mute On") ;
		else
			System.out.println("Mute Off") ;
		
	}

}
