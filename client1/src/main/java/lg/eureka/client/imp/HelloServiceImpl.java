package lg.eureka.client.imp;

import lg.devocker.api.test.HelloService;
import lg.devocker.dto.test.FirstDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lg
 * @date 2018-11-01
 * &Desc
 */
@RestController
@RequestMapping("/a")
public class HelloServiceImpl implements HelloService {
    @Value("${hello}")
    String hello;
    @Override
    @RequestMapping("/b")
    public FirstDTO hello(FirstDTO firstDTO) {
        firstDTO.setNumbler(Integer.valueOf(hello));
        return firstDTO;
    }
}
