package com.nowcoder.community;

import com.nowcoder.community.dao.LoginTicketMapper;
import com.nowcoder.community.entity.LoginTicket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class Test1 {

    @Autowired
    LoginTicketMapper loginTicketMapper;

    @Test
    public void test() {
        LoginTicket loginTicket = loginTicketMapper.selectByTicket("0E7C85F912CC2AD94F1D24EAEA10A7E7");
        System.out.println(loginTicket);
    }

}
