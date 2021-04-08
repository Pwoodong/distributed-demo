package com.jiu.distributed.config.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * Package com.jiu.distributed.config.redis
 * ClassName RedssonConfig.java
 * Description
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2021-04-08 下午9:46
 **/
@Configuration
public class RedissonConfig {

//    @Bean(destroyMethod="shutdown")
//    public RedissonClient redisson() throws IOException {
//        RedissonClient redisson = Redisson.create(Config.fromYAML(new ClassPathResource("redisson-single.yml").getInputStream()));
//        return redisson;
//    }

    @Bean
    public RedissonClient getRedisson() {
        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://127.0.0.1:6379")
                .setRetryInterval(5000)
                .setTimeout(10000)
                .setConnectTimeout(10000);
        return Redisson.create(config);
    }

}
