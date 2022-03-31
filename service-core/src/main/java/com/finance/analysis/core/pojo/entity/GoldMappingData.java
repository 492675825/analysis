package com.finance.analysis.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tbl_d_au_td_year_and_month_mapping")
public class GoldMappingData {
//使用该表数据tbl_au_td_gold_data_analysis
    private Long id;
    private String yearNumber;
    private String monthNumber;
    private Integer mappingSum;

}
