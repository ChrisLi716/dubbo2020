package com.chris.dubbo.service.stub;

import cn.hutool.core.util.StrUtil;
import com.chris.dubbo.bean.UserAddress;
import com.chris.dubbo.service.UserService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserServiceStub implements UserService {

    private final UserService userService;


    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("invoke UserServiceStub");
        if (StrUtil.isNotEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
