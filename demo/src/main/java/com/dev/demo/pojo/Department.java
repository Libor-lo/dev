package com.dev.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * @Auther: 博lo
 * @Date: 2020/2/27 21:17
 * @Description:
 */
@Data
public class Department implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    private List<Employee> employeeList;

    private LocalDate createTime;
}
