package com.cesare.gulimall.member.dao;

import com.cesare.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author luzhengsheng
 * @email 1844567512@qq.com
 * @date 2021-04-03 13:50:57
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
