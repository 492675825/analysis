package com.finance.analysis.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.finance.analysis.core.pojo.entity.NewsCCTVData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsCCTVDataMapper extends BaseMapper<NewsCCTVData> {

    List<NewsCCTVData> newsCCTVData();

    List<NewsCCTVData> selectByDate(String selectDate);

    List<NewsCCTVData> selectByNewsType(String news_type);

    List<NewsCCTVData> selectByDataAndType(String select_date, String select_type);
}
