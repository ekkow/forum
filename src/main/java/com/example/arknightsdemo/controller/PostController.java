package com.example.arknightsdemo.controller;


import com.example.arknightsdemo.model.PageParameter;
import com.example.arknightsdemo.service.PostService;
import com.example.arknightsdemo.util.Result;
import com.example.arknightsdemo.vo.PostVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wx
 * @since 2021-07-07
 */
@RestController
@Api(tags = "帖子接口")
@RequestMapping("/posts")
public class PostController {

    final PostService postService;

    @Autowired
    public PostController(PostService postService){ this.postService = postService; }

    /**
     * 帖子分页查询
     * @param pageParameter
     * @return
     */
    @GetMapping
    @ApiOperation("帖子分页查询")
    public Result list(PageParameter pageParameter){
        return Result.success(postService.selectPageDTO(pageParameter));
    }

    /**
     * 发帖
     * @param postVO
     * @return
     */
    @PostMapping
    @ApiOperation("发帖")
    public Result create(PostVO postVO){
        if(postService.create(postVO) > 0){
            return Result.success();
        }
        return Result.error("发贴失败");
    }

    /**
     * 更新帖子主题
     * @param postVO
     * @return
     */
    @PutMapping
    @ApiOperation("更新帖子主题")
    public Result update(PostVO postVO){
        if(postService.update(postVO) > 0){
            return Result.success();
        }
        return Result.error("修改失败");
    }

    /**
     * 删帖
     * @param postid
     * @return
     */
    @DeleteMapping("/{postid}/enable")
    @ApiOperation("删帖")
    public Result delete(@PathVariable String postid){
        if(postService.delete(postid) > 0){
            return Result.success();
        }
        return Result.error("删除失败");
    }
}
