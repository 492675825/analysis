package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.NonFarmData;
import com.finance.analysis.core.pojo.entity.dto.NonFarmExcelDTO;

import java.io.InputStream;
import java.util.List;

public interface NonFarmExcelService extends IService<NonFarmData> {
    void exportExcel(InputStream inputStream);
    List<NonFarmExcelDTO> listExcelData();
}
