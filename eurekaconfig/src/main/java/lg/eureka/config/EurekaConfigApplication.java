package lg.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lg
 * @date 2018-10-31
 * &Desc config
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigApplication.class, args);
    }
}
