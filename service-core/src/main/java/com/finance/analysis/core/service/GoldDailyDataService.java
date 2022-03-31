package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.GoldData;

public interface GoldDailyDataService extends IService<GoldData> {
    IPage<GoldData> selectByPage(int currentPage, int pageSize);
}
