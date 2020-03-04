package com.dev.feign.controller;

import com.dev.common.respond.ErrorCode;
import com.dev.common.respond.RespondResult;
import com.dev.feign.config.eurekaClientFeign.DemoFeignClient;
import com.dev.feign.config.mq.MessageSender;
import com.dev.feign.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: 博lo
 * @Date: 2020/2/25 21:22
 * @Description:
 */

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private DemoFeignClient demoFeignClient;
    @Autowired
    private MessageSender messageSender;


    @GetMapping("/feign")
    public RespondResult<String> feign (){
        return demoFeignClient.hello();
    }

    @GetMapping("/feign/{id}")
    public RespondResult<Employee> feign (@PathVariable("id") Integer id){
        return demoFeignClient.employee(id);
    }

    @PostMapping("/feign/employee")
    public RespondResult<String> employee (@RequestBody Employee employee){

        boolean flag = messageSender.send(MessageBuilder.withPayload(employee).build());
        if (flag) {
            return RespondResult.success();
        }else {
            return RespondResult.failed(ErrorCode.SYSTEM_ERROR);
        }

    }

}
