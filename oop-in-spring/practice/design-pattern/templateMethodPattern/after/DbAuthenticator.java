package templateMethodPattern.after;

public class DbAuthenticator extends MyAuthenticator {

    @Override
    protected boolean doAuthenticate(String id, String pw) {
        User user = userDao.selectById(id);
        return user.equalPassword(pw);
    }

    @Override
    protected Auth createAuth(String id) {
        User user = userDao.selectById(id);
        return new Auth(id, user.getName());
    }
}
