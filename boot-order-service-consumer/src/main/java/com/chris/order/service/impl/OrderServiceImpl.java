package com.chris.order.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chris.dubbo.bean.UserAddress;
import com.chris.dubbo.service.OrderService;
import com.chris.dubbo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference(check = false, url = "127.0.0.1:20081")
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id：" + userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
