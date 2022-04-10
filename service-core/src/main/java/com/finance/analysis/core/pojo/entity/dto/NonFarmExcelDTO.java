package com.finance.analysis.core.pojo.entity.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class NonFarmExcelDTO {
    @ExcelProperty("id")
    private Long id;
    @ExcelProperty("version_date")
    private String versionDate;
    @ExcelProperty("current_value")
    private String currentValue;
    @ExcelProperty("predict_value")
    private String predictValue;
    @ExcelProperty("previous_value")
    private String previousValue;
}
