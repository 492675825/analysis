package com.finance.analysis.core.pojo.entity.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
//黄金价格下载
public class ExcelDTO {
    @ExcelProperty("id")
    private Long id;
    @ExcelProperty("version_date")
    private String versionDate;
    @ExcelProperty("refresh_date")
    private String refreshDate;
    @ExcelProperty("item")
    private String item;
    @ExcelProperty("open")
    private String open;
    @ExcelProperty("high")
    private String high;
    @ExcelProperty("low")
    private String low;
    @ExcelProperty("close")
    private String close;
    @ExcelProperty("up_or_down")
    private String upOrDown;
    @ExcelProperty("mapping")
    private Integer mapping;
    @ExcelProperty("date_number")
    private String dateNumber;
    @ExcelProperty("year_number")
    private String yearNumber;
    @ExcelProperty("month_number")
    private String monthNumber;
    @ExcelProperty("day_number")
    private String dayNumber;
}
