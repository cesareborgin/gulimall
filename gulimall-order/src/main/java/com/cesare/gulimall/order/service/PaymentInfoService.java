package com.cesare.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cesare.common.utils.PageUtils;
import com.cesare.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author luzhengsheng
 * @email 1844567512@qq.com
 * @date 2021-04-03 14:09:08
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

