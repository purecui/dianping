package com.code.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.code.dto.Result;
import com.code.entity.Voucher;

/**
 * <p>
 * 服务类
 * </p>
 */
public interface IVoucherService extends IService<Voucher> {

  Result queryVoucherOfShop(Long shopId);

  void addSeckillVoucher(Voucher voucher);
}
