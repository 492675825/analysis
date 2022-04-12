package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.NewsExcelMapper;
import com.finance.analysis.core.pojo.entity.NewsCCTVData;
import com.finance.analysis.core.pojo.entity.NonFarmData;
import com.finance.analysis.core.pojo.entity.dto.NewsExcelDTO;
import com.finance.analysis.core.pojo.entity.dto.NonFarmExcelDTO;
import com.finance.analysis.core.service.NewsExcelService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsExcelServiceImpl extends ServiceImpl<NewsExcelMapper, NewsCCTVData> implements NewsExcelService {
    @Override
    public void exportExcel(InputStream inputStream) {

    }

    @Override
    public List<NewsExcelDTO> listExcelData() {
        List<NewsCCTVData> excelList = baseMapper.selectList(null);
        ArrayList<NewsExcelDTO> excelDTOList = new ArrayList<>(excelList.size());
        excelList.forEach(d ->{
            NewsExcelDTO newsExcelDTO = new NewsExcelDTO();
            BeanUtils.copyProperties(d, newsExcelDTO);
            excelDTOList.add(newsExcelDTO);
        });
        return excelDTOList;
    }
}
