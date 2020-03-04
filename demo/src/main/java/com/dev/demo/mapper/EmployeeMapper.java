package com.dev.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dev.demo.pojo.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeMapper extends BaseMapper<Employee> {




    public List<Employee> queryByAll ();

    public Employee queryById (Integer id);






}
