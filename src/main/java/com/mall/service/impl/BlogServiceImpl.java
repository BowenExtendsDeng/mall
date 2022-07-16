package com.mall.service.impl;

import com.mall.entity.Blog;
import com.mall.mapper.BlogMapper;
import com.mall.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bowen
 * @since 2022-07-15
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
