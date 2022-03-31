package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.GoldData;

import java.util.List;
import java.util.Map;

public interface GoldYearlyDataService extends IService<GoldData> {
    List<Map<String, Object>> yearlyData();
}
