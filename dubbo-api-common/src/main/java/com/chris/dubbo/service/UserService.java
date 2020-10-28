package com.chris.dubbo.service;

import com.chris.dubbo.bean.UserAddress;

import java.util.List;

public interface UserService {

    List<UserAddress> getUserAddressList(String userId);
}
