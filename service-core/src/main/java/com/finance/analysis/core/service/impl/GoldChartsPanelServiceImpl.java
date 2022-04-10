package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.GoldDailyDataMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.service.GoldChartsPanelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GoldChartsPanelServiceImpl extends ServiceImpl<GoldDailyDataMapper, GoldData> implements GoldChartsPanelService {

    @Resource
    private GoldDailyDataMapper goldDailyDataMapper;

    @Override
    public List<GoldData> selectMaxVersionDate() {
        List<GoldData> list = goldDailyDataMapper.selectMaxVersionDate();
        return list;
    }
}
