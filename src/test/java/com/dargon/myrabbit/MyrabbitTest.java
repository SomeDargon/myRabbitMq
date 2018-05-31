package com.dargon.myrabbit;

import com.dargon.myrabbit.hello.Sender;
import com.dargon.myrabbit.many.NeoSender;
import com.dargon.myrabbit.many.NeoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyrabbitTest {
    @Autowired
    private NeoSender sender;
    @Autowired
    private NeoSender2 neoSender2;

    public void test(){
//        sender.send();
    }

    @Test
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            sender.send(i);
            neoSender2.send(i);
        }
    }
}
