package enigma_camp.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void halloService() {
        Assertions.assertEquals("Hello Zikri", helloService.hello("Zikri"));
        Assertions.assertEquals("bye Zikri", helloService.bye("Zikri"));
    }
}