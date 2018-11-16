import api.UserApi;
import dto.UserDTO;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import req.UserReq;

/**
 * @author cui jun on 2018/10/28.
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class BookTest {

    private static Logger logger = Logger.getLogger(BookTest.class);

    @Autowired
    private UserApi userApi;

    @Test
    public void testGetBook() {
        UserReq userReq = new UserReq();
        userReq.setId(16);
        UserDTO dto = userApi.getUserDTO(userReq);
        logger.info("[rpc服务]：" + dto);
    }
}
