package decorator.example.email;

public class SecureDecorator extends ContentDecorator {
	public SecureDecorator(EMailContent decoratedContent) {
		super(decoratedContent);
	}
	public String getContent() {
		String content = super.getContent() ;
		String encryptedContent = encrypt(content) ;
		return encryptedContent ;
	}
	private String encrypt(String content) {
		return content + " Encrypted";
	}
}
