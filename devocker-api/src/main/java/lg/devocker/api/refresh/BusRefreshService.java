package lg.devocker.api.refresh;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author lg
 * @date 2018-11-02
 * &Desc 前求bus刷新配置
 */
@FeignClient(url = "localhost:7771")
public interface BusRefreshService {
    void postBusRefresh();
}
