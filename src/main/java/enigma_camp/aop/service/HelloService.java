package enigma_camp.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class HelloService {

    //Contoh tanpa AOP
    public String hello(String name) {
        log.info("Call HelloService.hello");
        return "Hello " + name;
    }

    public String bye(String name) {
        log.info("Call HelloService.bye");
        return "bye " + name;
    }




}
