package com.domenic.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domenic.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}