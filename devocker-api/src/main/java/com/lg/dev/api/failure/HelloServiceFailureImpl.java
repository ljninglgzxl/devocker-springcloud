package com.lg.dev.api.failure;

import com.lg.dev.dto.test.FirstDTO;
import com.lg.dev.api.test.HelloService;

/**
 * @author lg
 * @date 2018-11-02
 * &Desc
 */
public class HelloServiceFailureImpl implements HelloService {
    @Override
    public FirstDTO hello(FirstDTO firstDTO) {
        firstDTO.setFailureMessage("trigger circuit breaker");
        return firstDTO;
    }
}
