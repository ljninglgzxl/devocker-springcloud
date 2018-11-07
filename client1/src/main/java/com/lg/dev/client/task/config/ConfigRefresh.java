package com.lg.dev.client.task.config;

/**
 * @author lg
 * @date 2018-11-02
 * &Desc 定时请求bus/refresh,刷新配置
 */
/*@Component
public class ConfigRefresh {
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
}*/
