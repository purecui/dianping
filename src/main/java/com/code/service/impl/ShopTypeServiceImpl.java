package com.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.code.entity.ShopType;
import com.code.mapper.ShopTypeMapper;
import com.code.service.IShopTypeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 */
@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements
    IShopTypeService {

}
