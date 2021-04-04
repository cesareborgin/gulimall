package com.cesare.gulimall.order.dao;

import com.cesare.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author luzhengsheng
 * @email 1844567512@qq.com
 * @date 2021-04-03 14:09:08
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
