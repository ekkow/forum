package com.example.arknightsdemo.controller;


import com.example.arknightsdemo.model.PageParameter;
import com.example.arknightsdemo.service.ReplyService;
import com.example.arknightsdemo.util.Result;
import com.example.arknightsdemo.vo.ReplyVO;
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
@Api(tags = "回复接口")
@RequestMapping("/replys")
public class ReplyController {

    final ReplyService replyService;

    @Autowired
    public ReplyController(ReplyService replyService){ this.replyService = replyService; }

    @GetMapping("/{postid}")
    @ApiOperation("帖子所有楼层分页")
    public Result list(PageParameter pageParameter, @PathVariable String postid){
        return Result.success(replyService.selectPageDTO(pageParameter,postid));
    }

    @PostMapping
    @ApiOperation("回复")
    public Result create(ReplyVO replyVO){
        if(replyService.create(replyVO) > 0){
            return Result.success();
        }
        return Result.error("回复失败");
    }

    @PutMapping("/{postid}/update")
    @ApiOperation("修改回复")
    public Result update(@PathVariable String postid,@RequestParam(value = "floor") String floor,@RequestParam(value = "content") String content){
        if(replyService.update(postid,floor,content) > 0){
            return Result.success();
        }
        return Result.error("修改失败");
    }

    @DeleteMapping("/{postid}/delete")
    @ApiOperation("删除回复")
    public Result delete(@PathVariable String postid,@RequestParam(value = "floor") String floor){
        if(replyService.delete(postid,floor) > 0){
            return Result.success();
        }
        return Result.error("删除失败");
    }

}
