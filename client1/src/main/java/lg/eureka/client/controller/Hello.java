package lg.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lg
 * @date 2018-10-31
 * &Desc test request
 */
@Controller
@RestController
public class Hello {
    @Value("${hello}")
    String hello;
    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String test(){
        return  hello+":port:"+port;
    }
    @RequestMapping("/info")
    public String info(){
        return "this is a localhost client";
    }
}
