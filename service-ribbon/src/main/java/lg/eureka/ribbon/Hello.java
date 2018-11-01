package lg.eureka.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lg
 * @date 2018-10-31
 * &Desc test ribbon
 */
@Controller
@RestController
public class Hello {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/test")
    public String getHello(){
        return restTemplate.getForObject("http://CLIENT1/hello",String.class);
    }
}
