package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.GoldYearlyDataMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.service.GoldYearlyDataService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoldYearlyDataServiceImpl extends ServiceImpl<GoldYearlyDataMapper, GoldData> implements GoldYearlyDataService {
    @Override
    public List<Map<String, Object>> yearlyData() {
        QueryWrapper<GoldData> wrapper = new QueryWrapper<>();
        wrapper.select("year_number, sum(mapping) as totalCount");
        wrapper.groupBy("year_number");
        wrapper.orderByDesc("year_number");
        List<Map<String, Object>> list = listMaps(wrapper);
        return list;
    }
}
