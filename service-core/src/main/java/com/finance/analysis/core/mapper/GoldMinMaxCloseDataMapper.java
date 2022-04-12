package com.finance.analysis.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.finance.analysis.core.pojo.entity.GoldMinMaxCloseData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoldMinMaxCloseDataMapper extends BaseMapper<GoldMinMaxCloseData> {
    List<GoldMinMaxCloseData> minMaxClose();
}
