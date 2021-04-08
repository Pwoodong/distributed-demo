package com.jiu.distributed.config.zk;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Package com.jiu.distributed.config.zk
 * ClassName WrapperZk.java
 * Description
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2021-04-08 下午8:53
 **/
@Data
@Component
@ConfigurationProperties(prefix = "curator")
public class WrapperZk {

    private int retryCount;

    private int elapsedTimeMs;

    private String connectString;

    private int sessionTimeoutMs;

    private int connectionTimeoutMs;

}
