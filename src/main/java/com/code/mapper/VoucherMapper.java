package com.code.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.code.entity.Voucher;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 */
public interface VoucherMapper extends BaseMapper<Voucher> {

  List<Voucher> queryVoucherOfShop(@Param("shopId") Long shopId);
}
