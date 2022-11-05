package com.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.code.entity.Blog;
import com.code.mapper.BlogMapper;
import com.code.service.IBlogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
