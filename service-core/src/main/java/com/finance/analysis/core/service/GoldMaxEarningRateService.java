package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.mapper.GoldMaxEarningRateMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.GoldMaxEarningRate;

import java.util.List;

public interface GoldMaxEarningRateService extends IService<GoldMaxEarningRate> {
    List<GoldMaxEarningRate> maxEarningRate();
}
