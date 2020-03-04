package com.dev.feign.config.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MyChannel {

    String OUTPUT_FEIGN = "output-dev-feign";
    String INPUT_DEMO = "input-dev-demo";

    @Output(OUTPUT_FEIGN)
    MessageChannel output_feign();

    @Input(INPUT_DEMO)
    SubscribableChannel input_demo();
}
