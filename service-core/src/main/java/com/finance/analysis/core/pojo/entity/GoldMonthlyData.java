package com.finance.analysis.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tbl_m_au_td_gold_data_mapping")
public class GoldMonthlyData {
    private Long id;
    private String monthNumber;
    private float currentSumMapping;
    private float historyAverageMapping;
    private float historySumMapping;
}
