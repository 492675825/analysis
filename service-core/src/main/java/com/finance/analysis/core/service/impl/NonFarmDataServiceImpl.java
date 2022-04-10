package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.NonFarmDataMapper;

import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.NonFarmData;
import com.finance.analysis.core.service.NonFarmDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NonFarmDataServiceImpl extends ServiceImpl<NonFarmDataMapper, NonFarmData> implements NonFarmDataService {
    @Resource
    private NonFarmDataMapper nonFarmDataMapper;


    @Override
    public IPage<NonFarmData> selectNonFarmData(int currentPage, int pageSize) {
        QueryWrapper<NonFarmData> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("version_date"); //根据version_date字段进行排序
        Page<NonFarmData> page = new Page<>(currentPage, pageSize);
        IPage<NonFarmData> nonFarmDataIpage = nonFarmDataMapper.selectPage(page, wrapper);
        return nonFarmDataIpage;
    }
}
