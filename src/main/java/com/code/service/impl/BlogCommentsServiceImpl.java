package com.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.code.entity.BlogComments;
import com.code.mapper.BlogCommentsMapper;
import com.code.service.IBlogCommentsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 */
@Service
public class BlogCommentsServiceImpl extends
    ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
