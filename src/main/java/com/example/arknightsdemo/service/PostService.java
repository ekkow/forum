package com.example.arknightsdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.arknightsdemo.dto.PostDTO;
import com.example.arknightsdemo.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.arknightsdemo.model.PageCollection;
import com.example.arknightsdemo.model.PageParameter;
import com.example.arknightsdemo.vo.PostVO;
import org.springframework.data.domain.Page;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wx
 * @since 2021-07-07
 */
public interface PostService extends IService<Post> {

    PageCollection<PostDTO> selectPageDTO(PageParameter pageParameter);

    int create(PostVO postVO);

    int update(PostVO postVO);

    int delete(String postid);
}
