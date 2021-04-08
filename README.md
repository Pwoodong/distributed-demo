# 分布式下的一些小demo
### 项目简介

分布式下的一些Demo实现，如：分布式ID、分布式锁等；

### 分布式ID

1、雪花算法

### 分布式锁

1、基于MySQL实现的分布式锁

2、基于Redis实现的分布式锁

3、基于Zookeeper实现的分布式锁

### 使用

Maven导入包

```
<!-- zookeeper -->
<dependency>
    <groupId>org.apache.zookeeper</groupId>
    <artifactId>zookeeper</artifactId>
    <version>3.6.2</version>
</dependency>

<dependency>
    <groupId>org.apache.curator</groupId>
    <artifactId>curator-framework</artifactId>
    <version>5.1.0</version>
</dependency>

<dependency>
    <groupId>org.apache.curator</groupId>
    <artifactId>curator-recipes</artifactId>
    <version>5.1.0</version>
</dependency>

<!-- redis -->
<dependency>
    <groupId>org.redisson</groupId>
    <artifactId>redisson-spring-boot-starter</artifactId>
    <version>3.15.3</version>
</dependency>

<dependency>
    <groupId>org.redisson</groupId>
    <artifactId>redisson</artifactId>
    <version>3.15.3</version>
</dependency>
```

安装Redis、Zookeeper，参考官方文档；

集群搭建可以参考博文：https://pwoodong.github.io/liaoyj.github.io/

### 技术交流

QQ:892471693

Gmail:pbhealthclub@gmail.com