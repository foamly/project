package com.mx.rebbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitMq {
    @Bean
    public Queue messageQueue(){
        return new Queue("payGoods");
    }
}
