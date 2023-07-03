package dao;

import com.hello.spring4.dao.BoardDAO;
import com.hello.spring4.model.Board;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/servlet-context.xml",
        "classpath:spring/root-context.xml"})
@WebAppConfiguration
public class BoardDAOUnitTest {

    @Autowired
    BoardDAO bdao;

    @Test
    public void selectBoard() throws Exception{
        int cpage = 3;
        int snum = (cpage - 1) *15;
        List<Board> result = bdao.selectBoard(snum);

        assertEquals(result.size(),15);
        System.out.println(result);
    }
    @Test
    public void selectOneBoard() throws Exception{
        String bno = "450";
        Board result = bdao.selectOneBoard(bno);

        assertNotNull(result);
        System.out.println(result);
    }

}
