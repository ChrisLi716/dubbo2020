package com.chris.user.service.impl;

import com.chris.dubbo.bean.UserAddress;
import com.chris.dubbo.service.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserServiceImpl2 implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("retry signal.....new....");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList(address1, address2);
    }
}