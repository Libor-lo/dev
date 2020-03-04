package com.dev.demo;

import cn.hutool.extra.spring.SpringUtil;
import com.dev.demo.mapper.EmployeeMapper;

import com.dev.demo.pojo.Employee;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoApplication {

    @Bean
    public SpringUtil springUtil (){
        return new SpringUtil();
    }


    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

//        EmployeeMapper employeeMapper = SpringUtil.getBean(EmployeeMapper.class);
//        Employee employee = new Employee();
//        employee.setAge(24);
//        employee.setName("小红");
//        employee.setEmail("xiaohong@gmail.com");
//        employee.setEnroll(LocalDateTime.parse("2020-03-05T09:00:00"));
//        employee.setDId(1);
//        employeeMapper.insert(employee);
//        System.out.println(employee);

    }

}
