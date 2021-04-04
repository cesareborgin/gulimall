package com.cesare.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cesare.common.utils.PageUtils;
import com.cesare.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author luzhengsheng
 * @email 1844567512@qq.com
 * @date 2021-04-03 00:05:10
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

