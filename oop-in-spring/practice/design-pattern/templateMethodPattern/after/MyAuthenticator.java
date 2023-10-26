package templateMethodPattern.after;

public abstract class MyAuthenticator {
    // template method
    public Auth authenticate(String id, String pw){
        if(!doAuthenticate(id,pw)) {
            throw createException();
        }
        return createAuth(id);
    }

    protected abstract boolean doAuthenticate(String id, String pw);

    private RuntimeException createException() {
        throw new AuthException();
    }

    protected abstract Auth createAuth(String id);
}