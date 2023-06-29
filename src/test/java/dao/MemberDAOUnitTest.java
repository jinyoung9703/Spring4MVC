package dao;

import com.hello.spring4.dao.MemberDAO;
import com.hello.spring4.model.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/servlet-context.xml",
        "classpath:spring/root-context.xml"})
@WebAppConfiguration
public class MemberDAOUnitTest {

    @Autowired MemberDAO mdao;

    @Test
    @Transactional
    public void insertMember() throws Exception{
        Member m = new Member(null, "abc123a","987xyz","abc123","abc123@987xyz.co.kr","null");
        // assertEquals(테스트메서드, 검증값)
        assertEquals(mdao.insertMember(m),1);
    }
    @Test

    public void loginMember() throws Exception{
        Member m = new Member();
        m.setUserid("abc123");
        m.setPassword("987xyz");

//        System.out.println(mdao.loginMember(m)); 넘어오고 싶은걸 보고싶을때

        assertNotNull(mdao.loginMember(m));// 표준을로 있다 없다로 간단하게 봄

    }
}
