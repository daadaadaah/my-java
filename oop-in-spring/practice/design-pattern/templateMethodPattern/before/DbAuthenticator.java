package templateMethodPattern.before;

public class DbAuthenticator {

    public Auth authenticate(String id, String pw){
        //사용자 정보로 인증 확인
        User user = userDao.selectById(id);
        boolean auth = user.equalPassword(pw);

        //인증 실패 예외 처리
        if(!auth) {
            throw createException();
        }

        //인증 성공시, 인증 정보 제공
        return new Auth(id, user.getName());
    }

    private AuthException createException(){
        return new AuthException();
    }
}
