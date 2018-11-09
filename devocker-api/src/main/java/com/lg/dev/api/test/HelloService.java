package com.lg.dev.api.test;

import com.lg.dev.dto.test.FirstDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lg
 * @date 2018-11-01
 * &Desc
 */
@FeignClient(name="client1")
public interface HelloService {
    @RequestMapping(value = "/client1/b")
    @ResponseBody
    FirstDTO hello(@RequestBody  FirstDTO firstDTO);

}

