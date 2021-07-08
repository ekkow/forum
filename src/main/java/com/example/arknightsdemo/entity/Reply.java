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
@ApiModel(value="Reply对象", description="")
public class Reply extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "回复帖子id")
    private String postid;

    @ApiModelProperty(value = "回复人id")
    private String userid;

    @ApiModelProperty(value = "回复内容")
    private String content;

    @ApiModelProperty(value = "该回复所在楼层")
    private String floor;


}
