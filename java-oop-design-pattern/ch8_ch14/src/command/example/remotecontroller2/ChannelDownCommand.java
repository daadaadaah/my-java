package command.example.remotecontroller2;

public class ChannelDownCommand implements Command {
	private ChannelController channelController ;
	public ChannelDownCommand(ChannelController channelController) {
		this.channelController = channelController ;
	}
	public void execute() {
		channelController.channelDown() ;
	}
}
