package com.dev.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

    interface postGroup{};

    interface putGroup{};

    @TableId(type = IdType.AUTO)
    private Integer id;

    private  String name;

    private Integer age;

    @Email
    private String email;

    private Integer dId;

    private Department department;

    private LocalDateTime enroll;
}
