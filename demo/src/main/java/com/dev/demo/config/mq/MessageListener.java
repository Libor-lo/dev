package com.dev.demo.config.mq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Auther: 博lo
 * @Date: 2020/3/4 13:31
 * @Description:
 */
@Component
@EnableBinding(MyChannel.class)
public class MessageListener {



    @StreamListener("input-dev-feign")
    private void listen(Message message){
        System.out.println("============================================================");
        System.out.println(message.getPayload());
    }


}
