package com.cesare.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cesare.common.utils.PageUtils;
import com.cesare.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author luzhengsheng
 * @email 1844567512@qq.com
 * @date 2021-04-03 13:50:57
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

