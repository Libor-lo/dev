package com.dev.feign.pojo;

import lombok.Data;

import javax.validation.constraints.Email;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Auther: 博lo
 * @Date: 2020/2/27 21:16
 * @Description:
 */
@Data
public class Employee implements Serializable {

    private Integer id;

    private  String name;

    private Integer age;

    private String email;

    private Integer dId;

    private Department department;

    private LocalDateTime enroll;
}
