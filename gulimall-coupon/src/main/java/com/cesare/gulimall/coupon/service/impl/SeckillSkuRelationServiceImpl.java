package com.cesare.gulimall.coupon.service.impl;

import com.cesare.common.utils.PageUtils;
import com.cesare.common.utils.Query;
import com.cesare.gulimall.coupon.dao.SeckillSkuRelationDao;
import com.cesare.gulimall.coupon.entity.SeckillSkuRelationEntity;
import com.cesare.gulimall.coupon.service.SeckillSkuRelationService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity> implements SeckillSkuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuRelationEntity> page = this.page(
                new Query<SeckillSkuRelationEntity>().getPage(params),
                new QueryWrapper<SeckillSkuRelationEntity>()
        );

        return new PageUtils(page);
    }

}