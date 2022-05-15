package chap08.spring;

import java.util.Collection;

public class MemberListPrinter {

    private MemberDao memberDao;
    private MemberPrinter printer;

    public MemberListPrinter(MemberDao memberDao, MemberPrinter priter) {
        this.memberDao=memberDao;
        this.printer=priter;
    }

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(m->printer.print(m));
    }
}
