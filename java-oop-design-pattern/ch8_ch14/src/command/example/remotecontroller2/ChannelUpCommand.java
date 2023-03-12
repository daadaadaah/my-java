package command.example.remotecontroller2;

public class ChannelUpCommand implements Command {
	private ChannelController channelController ;
	public ChannelUpCommand(ChannelController channelController) {
		this.channelController = channelController ;
	}
	public void execute() {
		channelController.channelUp() ;
	}
}
