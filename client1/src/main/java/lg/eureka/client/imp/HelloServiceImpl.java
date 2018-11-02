package lg.eureka.client.imp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lg.devocker.api.test.HelloService;
import lg.devocker.dto.test.FirstDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lg
 * @date 2018-11-01
 * &Desc
 */
@RestController
@RequestMapping("/a")
@RefreshScope
public class HelloServiceImpl implements HelloService {
    @Value("${server.port}")
    String port;
    @Override
    @RequestMapping("/b")
    public FirstDTO hello(FirstDTO firstDTO) {
        firstDTO.setNumbler(Integer.valueOf(port)+766);
        return firstDTO;
    }
}
