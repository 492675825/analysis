package com.finance.analysis.core.pojo.entity.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
//@TableName(value = "tbl_d_news_cctv_union_all")
public class NewsExcelDTO {

    @ExcelProperty("version_date")
    private String versionDate;
    @ExcelProperty("title")
    private String title;
    @ExcelProperty("brief")
    private String brief;
    @ExcelProperty("keyword")
    private String keyword;
    @ExcelProperty("url")
    private String url;
    @ExcelProperty("refresh_date")
    private String refreshDate;
    @ExcelProperty("news_type")
    private String newsType;
}
