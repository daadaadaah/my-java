package decorator.example.email;

public class BasicEMailContent extends EMailContent {
	private String content; 
	public BasicEMailContent(String content) { this.content = content; }	
	public String getContent() {
		return content;
	}
}
