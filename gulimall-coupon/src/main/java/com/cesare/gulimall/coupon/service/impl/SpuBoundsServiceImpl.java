package com.cesare.gulimall.coupon.service.impl;

import com.cesare.common.utils.PageUtils;
import com.cesare.common.utils.Query;
import com.cesare.gulimall.coupon.dao.SpuBoundsDao;
import com.cesare.gulimall.coupon.entity.SpuBoundsEntity;
import com.cesare.gulimall.coupon.service.SpuBoundsService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements SpuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuBoundsEntity> page = this.page(
                new Query<SpuBoundsEntity>().getPage(params),
                new QueryWrapper<SpuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}