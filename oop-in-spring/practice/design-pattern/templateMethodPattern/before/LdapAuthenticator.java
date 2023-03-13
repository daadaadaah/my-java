package templateMethodPattern.before;

public class LdapAuthenticator {
    public Auth authenticate(String id, String pw){
        //사용자 정보로 인증 확인
        boolean lauth = ldapClient.authenticate(id,pw);

        //인증 실패 예외 처리
        if(!auth) {
            throw createException();
        }

        //인증 성공시, 인증 정보 제공
        LdapContext ctx = ldapClient.find(id);
        return new Auth(id, ctx.getAttribute("name"));
    }

    private AuthException createException(){
        return new AuthException();
    }
}
