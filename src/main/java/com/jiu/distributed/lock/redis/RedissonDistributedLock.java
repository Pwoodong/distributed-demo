package com.jiu.distributed.lock.redis;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Package com.jiu.distributed.lock.redis
 * ClassName RedissonDistributedLock.java
 * Description Redisson分布式锁
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2021-04-08 下午9:50
 **/
@Service
public class RedissonDistributedLock {

    @Autowired
    private RedissonClient redissonClient;

    private final AtomicInteger product = new AtomicInteger(10);

    public boolean decrementProductStore(Long productId, Integer productQuantity) {
        String key = "dec_store_lock_" + productId;
        RLock lock = redissonClient.getLock(key);
        try {
            //加锁 操作很类似Java的ReentrantLock机制
            lock.lock();
            product.get();
            //如果库存为空
            if (product.get() == 0) {
                return false;
            }
            //简单减库存操作 没有重新写其他接口了
            product.set(product.get() - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //解锁
            lock.unlock();
        }
        return true;
    }

}
