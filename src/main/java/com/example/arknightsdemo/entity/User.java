package com.example.arknightsdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author wx
 * @since 2021-07-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="User对象", description="")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    private String userid;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    private String token;

    @ApiModelProperty(value = "电话")
    @TableField("phoneNum")
    private String phonenum;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "头像地址")
    private String avatar;


}
