package lg.eureka.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @RequestMapping(value = "/ribbon")
    @HystrixCommand(fallbackMethod = "serviceFailure")
    public String getHello(){
        System.out.println("ribbon");
        return restTemplate.getForObject("http://SERVICE-FEIGN/feign",String.class);
    }
    public String serviceFailure() {
        return " service-feign is not available  Zzzs!";
    }
}
