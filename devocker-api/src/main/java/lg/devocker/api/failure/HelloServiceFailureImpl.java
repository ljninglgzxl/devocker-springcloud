package lg.devocker.api.failure;

import lg.devocker.api.test.HelloService;
import lg.devocker.dto.test.FirstDTO;
import org.springframework.stereotype.Component;

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
