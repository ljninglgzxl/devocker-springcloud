package lg.eureka.feign.controller.test;

import lg.devocker.api.test.HelloService;
import lg.devocker.dto.test.FirstDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lg
 * @date 2018-11-01
 * &Desc test
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/feign")
    public String hello() {
        System.out.println("feign");
        FirstDTO firstDTO = new FirstDTO();
        firstDTO.setNumbler(123);
        FirstDTO res = helloService.hello(firstDTO);
        if (res.getFailureMessage() != null) {
            return res.getFailureMessage();
        }
        return helloService.hello(firstDTO).getNumbler().toString();
    }
}
