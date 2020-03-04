package com.dev.demo.controller;

import com.dev.common.respond.RespondResult;
import com.dev.demo.pojo.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 博lo
 * @Date: 2020/2/27 22:23
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    public RespondResult<String> hello(){
        return RespondResult.success("hello");
    }

    @GetMapping("/employee/{id}")
    public RespondResult<Employee> employee(@PathVariable("id") Integer id){

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("libor");
        employee.setEmail("849368067@qq.com");

        return RespondResult.success(employee);
    }
}
