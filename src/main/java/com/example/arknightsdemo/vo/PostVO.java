package com.example.arknightsdemo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PostVO {

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
}
