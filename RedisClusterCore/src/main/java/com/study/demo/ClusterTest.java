package com.study.demo;
/**
 * @author zhu_f  E-mail: zhu_fujian@163.com
 * @version 创建时间：2019年4月9日 下午4:43:19
 * 类说明
 */

import javax.annotation.PostConstruct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClusterTest {
    
    @Autowired
    StringRedisTemplate redisTemplate;
    
    ValueOperations<String, String> stringRedis;
    
    @PostConstruct
    public void init(){
        stringRedis=redisTemplate.opsForValue();
    }
    
    
    @Test
    public void testString (){
        stringRedis.set("name", "墨篱");
        System.out.println(stringRedis.get("name"));
    }
} 