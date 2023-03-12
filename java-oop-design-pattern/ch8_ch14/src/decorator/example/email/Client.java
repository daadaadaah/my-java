package decorator.example.email;

public class Client {
	public static void main(String[] args) {		
		EMailContent simple = new BasicEMailContent("Hello") ;
		System.out.println(simple.getContent()) ;
		
		EMailContent external = new ExternalDecorator(simple);
		System.out.println(external.getContent()) ;

		EMailContent secure = new SecureDecorator(simple) ;
		System.out.println(secure.getContent()) ;

		EMailContent secureAfterExternal = new SecureDecorator(external) ;
		System.out.println(secureAfterExternal.getContent()) ;
	}
}
