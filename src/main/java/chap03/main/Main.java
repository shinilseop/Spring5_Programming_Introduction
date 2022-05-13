package chap03.main;

import chap03.spring.ChangePasswordService;
import chap03.spring.MemberDao;
import chap03.spring.MemberRegisterService;

public class Main {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        MemberRegisterService regSvc = new MemberRegisterService(memberDao);
        ChangePasswordService pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
    }
}
