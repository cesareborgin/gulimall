package com.cesare.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cesare.common.utils.PageUtils;
import com.cesare.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author luzhengsheng
 * @email 1844567512@qq.com
 * @date 2021-04-03 13:12:22
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
