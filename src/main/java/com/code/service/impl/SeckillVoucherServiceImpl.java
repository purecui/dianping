package com.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.code.entity.SeckillVoucher;
import com.code.mapper.SeckillVoucherMapper;
import com.code.service.ISeckillVoucherService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 秒杀优惠券表，与优惠券是一对一关系 服务实现类
 * </p>
 */
@Service
public class SeckillVoucherServiceImpl extends
    ServiceImpl<SeckillVoucherMapper, SeckillVoucher> implements ISeckillVoucherService {

}
