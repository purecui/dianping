package com.code.controller;


import com.code.dto.Result;
import com.code.entity.ShopType;
import com.code.service.IShopTypeService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 */
@RestController
@RequestMapping("/shop-type")
public class ShopTypeController {

  @Resource
  private IShopTypeService typeService;

  @GetMapping("list")
  public Result queryTypeList() {
    List<ShopType> typeList = typeService
        .query().orderByAsc("sort").list();
    return Result.ok(typeList);
  }
}
