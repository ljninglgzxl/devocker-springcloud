package lg.devocker.api.test;

import lg.devocker.dto.test.FirstDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lg
 * @date 2018-11-01
 * &Desc
 */
@FeignClient(name="client1")
@RequestMapping("/a")
public interface HelloService {
    @RequestMapping(value = "/b")
    FirstDTO hello(@RequestBody  FirstDTO firstDTO);
}

