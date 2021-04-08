package com.jiu.distributed.controller;

import com.jiu.distributed.lock.redis.RedissonDistributedLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package com.jiu.distributed.controller
 * ClassName SecKillDemo.java
 * Description 秒杀Demo
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2021-04-08 下午10:01
 **/
@RestController
public class SecKillDemo {

    @Autowired
    private RedissonDistributedLock redissonDistributedLock;

    @GetMapping("test")
    public String createOrderTest() {
        if (!redissonDistributedLock.decrementProductStore(1L, 1)) {
            return "库存不足";
        }
        // 下单业务
        return "创建订单成功";
    }
}
