package com.finance.analysis.core.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.finance.analysis.core.pojo.entity.NonFarmData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NonFarmDataMapper extends BaseMapper<NonFarmData> {
    List<NonFarmData> seletNonFarmData();
}
