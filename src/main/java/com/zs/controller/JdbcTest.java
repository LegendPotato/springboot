package com.zs.controller;

import com.zs.mysql.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshuai_sx
 * @date 2019/3/5 10:16
 */

@RestController
public class JdbcTest {

    @Autowired
    private UserService userService;

    @RequestMapping("/testJdbc")
    public void testJdbc(){
        // 准备，清空user表
        userService.deleteAllUsers();
        // 插入5个用户
        userService.create("a", 1);
        userService.create("b", 2);
        userService.create("c", 3);
        userService.create("d", 4);
        userService.create("e", 5);

        // 查数据库，应该有5个用户
        System.out.println(userService.getAllUsers().intValue());

        // 删除两个用户
        userService.deleteByName("a");
        userService.deleteByName("e");

        // 查数据库，应该有5个用户
        System.out.println(userService.getAllUsers().intValue());

    }


}
