package lg.eureka.client.task.config;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.DefaultManagedHttpClientConnection;
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
    @Scheduled(cron = "10 * * * * ?")
    private void postBusRefresh() {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("http://localhost:7771/bus/refresh");
        try {
            httpClient.execute(httpPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
