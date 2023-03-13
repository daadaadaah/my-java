package templateMethodPattern.after;

public class LdapAuthenticator extends MyAuthenticator {

    @Override
    protected boolean doAuthenticate(String id, String pw) {
        return ldapClient.authenticate(id,pw);
    }

    @Override
    protected Auth createAuth(String id) {
        LdapContext ctx = ldapClient.find(id);
        return new Auth(id, ctx.getAttribute("name"));
    }
}
