package com.dev.demo.config.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MyChannel {

    String OUTPUT_DEMO = "output-dev-demo";
    String INPUT_FEIGN = "input-dev-feign";

    @Output(OUTPUT_DEMO)
    MessageChannel output_demo();

    @Input(INPUT_FEIGN)
    SubscribableChannel input_feign();
}
