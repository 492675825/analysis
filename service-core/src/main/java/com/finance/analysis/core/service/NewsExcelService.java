package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.NewsCCTVData;
import com.finance.analysis.core.pojo.entity.dto.NewsExcelDTO;
import com.finance.analysis.core.pojo.entity.dto.NonFarmExcelDTO;

import java.io.InputStream;
import java.util.List;

public interface NewsExcelService extends IService<NewsCCTVData> {
    void exportExcel(InputStream inputStream);
    List<NewsExcelDTO> listExcelData();
}
