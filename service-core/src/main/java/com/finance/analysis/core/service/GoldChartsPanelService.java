package com.finance.analysis.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.finance.analysis.core.pojo.entity.GoldData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface GoldChartsPanelService extends IService<GoldData> {
    List<GoldData> selectMaxVersionDate();
}
