package com.finance.analysis.core.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.GoldDailyDataMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.service.GoldDailyDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GoldDailyDataServiceImpl extends ServiceImpl<GoldDailyDataMapper, GoldData> implements GoldDailyDataService {
    @Resource
    private GoldDailyDataMapper goldDailyDataMapper;


    @Override
    public IPage<GoldData> selectByPage(int currentPage, int pageSize) {
        QueryWrapper<GoldData> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("version_date"); //根据version_date字段进行排序
        Page<GoldData> page = new Page<>(currentPage, pageSize);
        IPage<GoldData> goldDataIpage = goldDailyDataMapper.selectPage(page, wrapper);
        return goldDataIpage;
    }
}
