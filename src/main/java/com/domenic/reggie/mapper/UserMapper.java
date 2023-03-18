package com.domenic.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domenic.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
