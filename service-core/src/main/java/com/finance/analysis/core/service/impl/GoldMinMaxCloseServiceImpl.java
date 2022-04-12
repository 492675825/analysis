package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.GoldMinMaxCloseDataMapper;
import com.finance.analysis.core.pojo.entity.GoldMinMaxCloseData;
import com.finance.analysis.core.service.GoldMinMaxCloseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoldMinMaxCloseServiceImpl extends ServiceImpl<GoldMinMaxCloseDataMapper, GoldMinMaxCloseData> implements GoldMinMaxCloseService {
    @Resource
    private GoldMinMaxCloseDataMapper goldMinMaxCloseDataMapper;
    @Override
    public List<GoldMinMaxCloseData> minMaxClose() {
        List<GoldMinMaxCloseData> list = goldMinMaxCloseDataMapper.minMaxClose();
        return list;
    }
}
