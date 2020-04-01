package com.leo.produce;

import com.leo.produce.produce.Queue_Produce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = ProduceApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ProduceApplicationTests {

    @Resource
    private Queue_Produce queue_produce;


    @Test
    public void contextLoads() throws Exception{
        queue_produce.produceMessage();
    }




}
