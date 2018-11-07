package com.lg.dev.api.test;

import com.lg.dev.dto.test.FirstDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

