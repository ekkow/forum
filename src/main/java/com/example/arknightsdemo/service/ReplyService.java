package com.example.arknightsdemo.service;

import com.example.arknightsdemo.dto.ReplyDTO;
import com.example.arknightsdemo.entity.Reply;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.arknightsdemo.model.PageCollection;
import com.example.arknightsdemo.model.PageParameter;
import com.example.arknightsdemo.vo.ReplyVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wx
 * @since 2021-07-07
 */
public interface ReplyService extends IService<Reply> {

    PageCollection<ReplyDTO> selectPageDTO(PageParameter pageParameter,String postid);

    int create(ReplyVO replyVO);

    int delete(String postid,String floor);

    int update(String postid,String floor,String content);
}
