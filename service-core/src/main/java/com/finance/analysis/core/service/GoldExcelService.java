package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.dto.ExcelDTO;

import java.io.InputStream;
import java.util.List;

public interface GoldExcelService extends IService<GoldData> {
    void exportData(InputStream inputStream);

    List<ExcelDTO> listExcelData();
}
