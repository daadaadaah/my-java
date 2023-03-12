package decorator.example.email;

public abstract class ContentDecorator extends EMailContent {
	private EMailContent decoratedContent ;	
	public ContentDecorator(EMailContent decoratedContent) {
		this.decoratedContent = decoratedContent ;
	}
	public String getContent() {
		return decoratedContent.getContent() ;
	}
}
