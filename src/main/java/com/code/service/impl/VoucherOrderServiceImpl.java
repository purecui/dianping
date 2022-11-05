package com.code.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.code.entity.VoucherOrder;
import com.code.mapper.VoucherOrderMapper;
import com.code.service.IVoucherOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 */
@Service
public class VoucherOrderServiceImpl extends
    ServiceImpl<VoucherOrderMapper, VoucherOrder> implements IVoucherOrderService {

}
