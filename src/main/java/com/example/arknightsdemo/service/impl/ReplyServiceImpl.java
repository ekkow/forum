package com.example.arknightsdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.arknightsdemo.dto.ReplyDTO;
import com.example.arknightsdemo.entity.Reply;
import com.example.arknightsdemo.mapper.ReplyMapper;
import com.example.arknightsdemo.model.PageCollection;
import com.example.arknightsdemo.model.PageParameter;
import com.example.arknightsdemo.service.ReplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.arknightsdemo.vo.ReplyVO;
import io.swagger.models.auth.In;
import org.springframework.beans.BeanUtils;
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
public class ReplyServiceImpl extends ServiceImpl<ReplyMapper, Reply> implements ReplyService {

    @Override
    public PageCollection<ReplyDTO> selectPageDTO(PageParameter pageParameter, String postid){
        return new PageCollection<ReplyDTO>(this.baseMapper.selectPageDTO(pageParameter.getPage(),postid));
    }

    @Override
    public int create(ReplyVO replyVO) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("postid",replyVO.getPostid());
        Integer count = baseMapper.selectCount(wrapper);
        count = count + 1;
        String floor = String.valueOf(count);
        Reply reply = new Reply();
        BeanUtils.copyProperties(replyVO,reply);
        reply.setFloor(floor);
        return baseMapper.insert(reply);
    }

    @Override
    public int delete(String postid, String floor) {
        QueryWrapper<Reply> wrapper = new QueryWrapper<>();
        wrapper.eq("postid",postid).eq("floor",floor);
        Reply reply = baseMapper.selectOne(wrapper);
        reply.setContent("该评论因违反规定已被删除");
        return baseMapper.updateById(reply);
    }

    @Override
    public int update(String postid,String floor,String content) {
        QueryWrapper<Reply> wrapper = new QueryWrapper<>();
        wrapper.eq("floor",floor).eq("postid",postid);
        Reply reply = baseMapper.selectOne(wrapper);
        reply.setContent(content);
        return baseMapper.updateById(reply);
    }
}
