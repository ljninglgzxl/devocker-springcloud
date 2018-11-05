package lg.eureka.client.task.config;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author lg
 * @date 2018-11-02
 * &Desc 定时请求bus/refresh,刷新配置
 */
@Component
public class ConfigRefresh {
    /*    @Autowired
        BusRefreshService busRefreshService;*/
    @Scheduled(cron = "0 30 * * * ?")
    private void postBusRefresh() {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("http://localhost:8888/bus/refresh");
        try {
            httpClient.execute(httpPost);
        } catch (IOException e) {
            System.out.println(e.toString().substring(0,20));
        }
    }
}
