package command.example.remotecontroller2;

public class ChannelController {
	private int channel = 24 ;
	private TV tv ;

	public ChannelController(TV tv) {
		this.tv = tv ;
	}
	public void channelUp() {
		channel ++ ;
		tv.setChannel(channel) ;
	}

	public void channelDown() {
		channel -- ;	
		tv.setChannel(channel) ;
	}

}
