package com.lg.dev.biz.pipiline;

import com.lg.dev.redis.JedisClusterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

/**
 * @author lg
 * @date 2018-11-09
 * &Desc pipeline
 */
@Service
public class PipelineBiz {
    @Autowired
    private JedisClusterConfig jedisClusterConfig;
    private JedisCluster jedisCluster;

    public String testJedisCluster() {
        if (jedisCluster == null) {
            jedisCluster = jedisClusterConfig.getjedisCluster();
        }
        jedisCluster.set("1", "1111112111");
        return jedisCluster.get("1");
    }
}
