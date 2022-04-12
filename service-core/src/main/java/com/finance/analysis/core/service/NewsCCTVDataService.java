package com.finance.analysis.core.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.NewsCCTVData;

import java.util.List;

public interface NewsCCTVDataService extends IService<NewsCCTVData> {
    IPage<NewsCCTVData> selectByPage(int currentPage, int pageSize);

    List<NewsCCTVData> selectByDate(String selectDate);
}
