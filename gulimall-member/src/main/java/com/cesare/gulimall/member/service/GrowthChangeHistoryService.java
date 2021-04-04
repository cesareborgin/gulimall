package com.cesare.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cesare.common.utils.PageUtils;
import com.cesare.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author luzhengsheng
 * @email 1844567512@qq.com
 * @date 2021-04-03 13:50:57
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

