package top.cg0509.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskApplicationTests {

    @Test
    public void contextLoads() {


    }
    @Scheduled(fixedRate = 6000)
    public void test (){
        System.out.println("定时器启动了");
    }
}
