package decorator.example.email;

public class ExternalDecorator extends ContentDecorator {
	public ExternalDecorator(EMailContent decoratedContent) {
		super(decoratedContent);
	}
	public String getContent() {
		String content = super.getContent() ;
		String externalContent = addDisclaimer(content) ;
		return externalContent ;
	}
	private String addDisclaimer(String content) {
		return content + " Company Disclaimer";
	}
}
