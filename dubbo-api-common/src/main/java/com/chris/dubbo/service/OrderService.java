package com.chris.dubbo.service;

import com.chris.dubbo.bean.UserAddress;

import java.util.List;

public interface OrderService {
    List<UserAddress> initOrder(String userId);
}
