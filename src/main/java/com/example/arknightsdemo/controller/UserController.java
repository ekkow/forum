package com.example.arknightsdemo.controller;


import com.example.arknightsdemo.model.PageParameter;
import com.example.arknightsdemo.service.UserService;
import com.example.arknightsdemo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wx
 * @since 2021-07-07
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Result list(PageParameter pageParameter){
        return Result.success(userService.page(pageParameter.getPage(),null));
    }
}
