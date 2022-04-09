package com.rabbitmq.util;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author wanyu
 * @createTime 2022-04-09 0:30
 */
public class RabbitMqUtils {
    //得到一个连接的 channel
    public static Channel getChannel() throws Exception{
        //创建一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.117.130");
        factory.setUsername("wanyu");
        factory.setPassword("wanyu");
        Connection connection = factory.newConnection();
        return connection.createChannel();
    }
}

