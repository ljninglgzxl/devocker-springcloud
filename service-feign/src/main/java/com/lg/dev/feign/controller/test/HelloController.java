package com.lg.dev.feign.controller.test;

import com.lg.dev.api.test.HelloService;
import com.lg.dev.dto.test.FirstDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${config.service.id}")
    String id;
    @RequestMapping("/feign")
    public String hello() {
        System.out.println("feign");
        FirstDTO firstDTO = new FirstDTO();
        firstDTO.setNumbler(123);
        FirstDTO res = helloService.hello(firstDTO);
        if (res.getFailureMessage() != null) {
            return res.getFailureMessage();
        }
        return res.getNumbler().toString()+id;
    }
}
