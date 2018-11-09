package com.lg.dev.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lg
 * @date 2018-11-09
 * &Desc
 */
@Configuration
public class JedisClusterConfig {
    @Autowired
    private  RedisProperties redisProperties;

    public JedisCluster getjedisCluster() {
        String [] serverArray=redisProperties.getNodes().split(",");
        Set<HostAndPort> nodes=new HashSet<>();

        for (String ipPort:serverArray){
            String [] ipPortPair=ipPort.split(":");
            nodes.add(new HostAndPort(ipPortPair[0].trim(),Integer.valueOf(ipPortPair[1].trim())));

        }
        return  new JedisCluster(nodes);
    }
}
