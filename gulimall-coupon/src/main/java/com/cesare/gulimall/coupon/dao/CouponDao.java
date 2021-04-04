package com.cesare.gulimall.coupon.dao;

import com.cesare.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author luzhengsheng
 * @email 1844567512@qq.com
 * @date 2021-04-03 13:12:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
