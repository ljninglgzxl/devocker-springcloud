package lg.eureka.client.task.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author lg
 * @date 2018-11-02
 * &Desc 定时请求bus/refresh,刷新配置
 */
@Component
public class ConfigRefresh {
    @Scheduled(cron = "10 * * * * ?")
    private void postBusRefresh() {
    }
}
