package com.finance.analysis.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tbl_au_td_gold_data_analysis")
public class GoldMinMaxCloseData {
    private String yearNumber;
    private String minClose;
    private String minCloseVersionDate;
    private String minCloseMonth;
    private String maxClose;
    private String maxCloseVersionDate;
    private String maxCloseMonth;
}
