package com.finance.analysis.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tbl_non_farm_data")
public class NonFarmData {
    private Long id;
    private String versionDate;
    private String currentValue;
    private String predictValue;
    private String previousValue;
    private String refreshDate;
}
