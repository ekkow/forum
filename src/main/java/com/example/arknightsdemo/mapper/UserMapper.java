package com.example.arknightsdemo.mapper;

import com.example.arknightsdemo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wx
 * @since 2021-07-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
