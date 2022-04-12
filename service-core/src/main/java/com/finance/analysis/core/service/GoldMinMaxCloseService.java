package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.mapper.GoldMinMaxCloseDataMapper;
import com.finance.analysis.core.pojo.entity.GoldMinMaxCloseData;

import java.util.List;

public interface GoldMinMaxCloseService extends IService<GoldMinMaxCloseData> {
    List<GoldMinMaxCloseData> minMaxClose();
}
