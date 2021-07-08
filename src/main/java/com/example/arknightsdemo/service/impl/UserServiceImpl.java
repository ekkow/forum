package com.example.arknightsdemo.service.impl;

import com.example.arknightsdemo.entity.User;
import com.example.arknightsdemo.mapper.UserMapper;
import com.example.arknightsdemo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wx
 * @since 2021-07-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
