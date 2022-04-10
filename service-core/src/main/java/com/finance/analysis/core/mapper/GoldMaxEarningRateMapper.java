package com.finance.analysis.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.GoldMaxEarningRate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoldMaxEarningRateMapper extends BaseMapper<GoldMaxEarningRate> {
    List<GoldMaxEarningRate> maxEarningRate();
}
