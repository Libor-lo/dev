package com.dev.feign.config.mq;

import cn.hutool.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * @Auther: 博lo
 * @Date: 2020/3/3 20:22
 * @Description:
 */
@Component
@EnableBinding(MyChannel.class)
public class MessageSender {

    @Autowired
    @Qualifier(value = "output-dev-feign")
    private MessageChannel messageChannel;


        public boolean send(Message message){
        return messageChannel.send(message);
    }

    public boolean send(Message message,Long id){
        return messageChannel.send(message,id);
    }


}
