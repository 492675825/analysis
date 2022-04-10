package com.finance.analysis.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.finance.analysis.core.pojo.entity.GoldMonthlyData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoldMonthlyDataMapper extends BaseMapper<GoldMonthlyData> {
    List<GoldMonthlyData> selectMonthData();

}
