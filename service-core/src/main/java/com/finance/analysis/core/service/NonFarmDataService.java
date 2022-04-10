package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.NonFarmData;

import java.util.List;

public interface NonFarmDataService extends IService<NonFarmData> {
    IPage<NonFarmData> selectNonFarmData(int currentPage, int pageSize);
}
