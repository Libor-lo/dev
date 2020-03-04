package com.dev.feign.config.eurekaClientFeign;


import com.dev.common.respond.RespondResult;
import com.dev.feign.pojo.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("dev-demo")
public interface DemoFeignClient {

    @GetMapping("/demo/hello")
    public RespondResult<String> hello ();

    @GetMapping("/demo/employee/{id}")
    public RespondResult<Employee> employee (@PathVariable("id") Integer id);
}
