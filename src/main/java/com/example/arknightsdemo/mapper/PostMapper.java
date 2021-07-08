package com.example.arknightsdemo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.arknightsdemo.dto.PostDTO;
import com.example.arknightsdemo.entity.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wx
 * @since 2021-07-07
 */
@Mapper
public interface PostMapper extends BaseMapper<Post> {

    IPage<PostDTO> selectPageDTO(Page page);

}
