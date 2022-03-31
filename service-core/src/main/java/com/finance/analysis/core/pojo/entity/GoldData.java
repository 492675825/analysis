package com.finance.analysis.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tbl_au_td_gold_data_analysis")
public class GoldData {
//使用该表数据tbl_au_td_gold_data_analysis
    private Long id;
    private String versionDate;
    private String refreshDate;
    private String item;
    private String open;
    private String high;
    private String low;
    private String close;
    private String upOrDown;
    private Integer mapping;
}
