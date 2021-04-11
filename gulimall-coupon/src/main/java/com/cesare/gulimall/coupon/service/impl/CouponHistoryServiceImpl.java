package com.cesare.gulimall.coupon.service.impl;

import com.cesare.common.utils.PageUtils;
import com.cesare.common.utils.Query;
import com.cesare.gulimall.coupon.dao.CouponHistoryDao;
import com.cesare.gulimall.coupon.entity.CouponHistoryEntity;
import com.cesare.gulimall.coupon.service.CouponHistoryService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistoryEntity> implements CouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponHistoryEntity> page = this.page(
                new Query<CouponHistoryEntity>().getPage(params),
                new QueryWrapper<CouponHistoryEntity>()
        );

        return new PageUtils(page);
    }

}