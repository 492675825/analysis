package com.finance.analysis.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigInteger;

@Data
@TableName("tbl_au_td_gold_data_analysis")
public class GoldMaxEarningRate {
    private String yearNumber;
    private Double maxEarningRate;
    private Double averageEarningRate;
}
