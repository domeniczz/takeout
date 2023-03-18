package com.domenic.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domenic.reggie.entity.OrderDetail;
import com.domenic.reggie.mapper.OrderDetailMapper;
import com.domenic.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}