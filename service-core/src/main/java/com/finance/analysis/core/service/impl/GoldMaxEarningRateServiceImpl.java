package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.GoldMaxEarningRateMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.GoldMaxEarningRate;
import com.finance.analysis.core.service.GoldMaxEarningRateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoldMaxEarningRateServiceImpl extends ServiceImpl<GoldMaxEarningRateMapper, GoldMaxEarningRate> implements GoldMaxEarningRateService {
    @Resource
    private GoldMaxEarningRateMapper goldMaxEarningRateMapper;

    @Override
    public List<GoldMaxEarningRate> maxEarningRate() {
        List<GoldMaxEarningRate> list = goldMaxEarningRateMapper.maxEarningRate();
        return list;
    }
}
