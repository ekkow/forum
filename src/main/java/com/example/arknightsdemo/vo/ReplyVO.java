package com.example.arknightsdemo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ReplyVO {

    @ApiModelProperty(value = "回复帖子id")
    private String postid;

    @ApiModelProperty(value = "回复人id")
    private String userid;

    @ApiModelProperty(value = "回复内容")
    private String content;

}
