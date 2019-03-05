package com.zs.rabbit;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * rabbitmq demo
 * @author zhangshuai_sx
 * @date 2019/1/7 16:44
 */

@Component
public class RabbitReceiver {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "queue-1",
                    durable="true"),
            exchange = @Exchange(value = "exchange-1",
                    durable="true",
                    type= "topic",
                    ignoreDeclarationExceptions = "true"),
            key = "springboot.*"
    )
    )
    @RabbitHandler
    public void onMessage(Message message, Channel channel) throws Exception {
        System.err.println("consumer: " + message.getPayload());
        Long deliveryTag = (Long)message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
        //手工ACK
        channel.basicAck(deliveryTag, false);
    }
}