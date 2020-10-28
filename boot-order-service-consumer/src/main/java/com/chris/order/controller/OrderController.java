package com.chris.order.controller;

import com.chris.dubbo.bean.UserAddress;
import com.chris.dubbo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Resource
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder/{userId}")
    public List<UserAddress> initOrder(@PathVariable("userId") String userId) {
        return orderService.initOrder(userId);
    }
}
