package com.example.arknightsdemo.service.impl;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.arknightsdemo.dto.PostDTO;
import com.example.arknightsdemo.entity.Post;
import com.example.arknightsdemo.mapper.PostMapper;
import com.example.arknightsdemo.model.PageCollection;
import com.example.arknightsdemo.model.PageParameter;
import com.example.arknightsdemo.service.PostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.arknightsdemo.vo.PostVO;
import javafx.geometry.Pos;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

    @Override
    public PageCollection<PostDTO> selectPageDTO(PageParameter pageParameter) {
        return new PageCollection<PostDTO>(this.baseMapper.selectPageDTO(pageParameter.getPage()));
    }

    @Override
    public int create(PostVO postVO) {
        Post post = new Post();
        BeanUtils.copyProperties(postVO,post);
        post.setPostid(IdUtil.randomUUID());
        return this.baseMapper.insert(post);
    }

    @Override
    public int update(PostVO postVO) {
        Post post = new Post();
        BeanUtils.copyProperties(postVO,post);
        QueryWrapper<Post> wrapper = new QueryWrapper<>();
        wrapper.eq("postid",postVO.getPostid());
        return this.baseMapper.update(post,wrapper);
    }

    @Override
    public int delete(String postid) {
        QueryWrapper<Post> wrapper = new QueryWrapper<>();
        wrapper.eq("postid",postid);
        Post post = baseMapper.selectOne(wrapper);
        if(post == null){
            return 0;
        }
        post.setDeleted(1);
        return baseMapper.update(post,wrapper);
    }


}
