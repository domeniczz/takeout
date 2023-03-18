package com.domenic.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domenic.reggie.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {

}
