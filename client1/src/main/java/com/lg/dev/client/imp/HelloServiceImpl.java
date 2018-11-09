package com.lg.dev.client.imp;

import com.lg.dev.api.test.HelloService;
import com.lg.dev.dto.test.FirstDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lg
 * @date 2018-11-01
 * &Desc RestController保证调研着能够发现服务
 */
@RestController
@RefreshScope
public class HelloServiceImpl implements HelloService {
    @Value("${server.port}")
    String number;
    @Override
    public FirstDTO hello(@RequestBody FirstDTO firstDTO) {
        firstDTO.setNumbler(Integer.valueOf(number));
        return firstDTO;
    }
}
