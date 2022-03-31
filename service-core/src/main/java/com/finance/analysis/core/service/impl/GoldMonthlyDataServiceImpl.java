package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.GoldDailyDataMapper;
import com.finance.analysis.core.mapper.GoldMonthlyDataMapper;
import com.finance.analysis.core.pojo.entity.GoldMappingData;
import com.finance.analysis.core.service.GoldMonthlyDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GoldMonthlyDataServiceImpl extends ServiceImpl<GoldMonthlyDataMapper, GoldMappingData> implements GoldMonthlyDataService {
    @Resource
    private GoldMonthlyDataMapper goldMonthlyDataMapper;

    @Override
    public List<Map<String, Object>> groupbyData() {
        QueryWrapper<GoldMappingData> wrapper = new QueryWrapper<>();
        wrapper.select("month_number, sum(mapping_sum) as sum_number, avg(mapping_sum) as average_number");
        wrapper.groupBy("month_number");
        wrapper.orderByAsc("month_number");
        List<Map<String,Object>> list = listMaps(wrapper);
        return list;
    }
}
