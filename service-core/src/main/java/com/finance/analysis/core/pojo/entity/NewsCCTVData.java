package com.finance.analysis.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tbl_d_news_cctv_union_all")
public class NewsCCTVData {
    private String versionDate;
    private String title;
    private String brief;
    private String keyword;
    private String url;
    private String refreshDate;
    private String newsType;
}
