package com.example.arknightsdemo.entity;

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
@ApiModel(value="Post对象", description="")
public class Post extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "帖子id")
    private String postid;

    @ApiModelProperty(value = "发帖人id")
    private String userid;

    @ApiModelProperty(value = "帖子标题")
    private String title;

    @ApiModelProperty(value = "帖子内容")
    private String content;

    @ApiModelProperty(value = "帖子主题")
    private String category;

    @ApiModelProperty(value = "逻辑删除")
    private int deleted;
}
