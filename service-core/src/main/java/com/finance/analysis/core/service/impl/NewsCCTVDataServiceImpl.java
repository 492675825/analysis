package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.NewsCCTVDataMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.NewsCCTVData;
import com.finance.analysis.core.service.NewsCCTVDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsCCTVDataServiceImpl extends ServiceImpl<NewsCCTVDataMapper, NewsCCTVData> implements NewsCCTVDataService {
    @Resource
    private NewsCCTVDataMapper newsCCTVDataMapper;

    @Override
    public IPage<NewsCCTVData> selectByPage(int currentPage, int pageSize) {
        QueryWrapper<NewsCCTVData> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("version_date"); //根据version_date字段进行排序
        Page<NewsCCTVData> page = new Page<>(currentPage, pageSize);
        IPage<NewsCCTVData> newsCCTVDataIPage = newsCCTVDataMapper.selectPage(page, wrapper);
        return newsCCTVDataIPage;
    }

    @Override
    public List<NewsCCTVData> selectByDate(String selectDate) {
        List<NewsCCTVData> list = newsCCTVDataMapper.selectByDate(selectDate);
        return list;
    }
}
