package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.GoldMonthlyData;

import java.util.List;
import java.util.Map;

public interface GoldMonthlyDataService extends IService<GoldMonthlyData> {
    List<Map<String, Object>> groupbyData();
    List<GoldMonthlyData> selectMonthData();
}
