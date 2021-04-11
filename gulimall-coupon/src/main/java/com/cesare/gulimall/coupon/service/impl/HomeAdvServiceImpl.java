package com.cesare.gulimall.coupon.service.impl;

import com.cesare.common.utils.PageUtils;
import com.cesare.common.utils.Query;
import com.cesare.gulimall.coupon.dao.HomeAdvDao;
import com.cesare.gulimall.coupon.entity.HomeAdvEntity;
import com.cesare.gulimall.coupon.service.HomeAdvService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;



@Service("homeAdvService")
public class HomeAdvServiceImpl extends ServiceImpl<HomeAdvDao, HomeAdvEntity> implements HomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeAdvEntity> page = this.page(
                new Query<HomeAdvEntity>().getPage(params),
                new QueryWrapper<HomeAdvEntity>()
        );

        return new PageUtils(page);
    }

}