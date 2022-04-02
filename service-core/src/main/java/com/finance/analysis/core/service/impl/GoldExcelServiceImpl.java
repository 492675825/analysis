package com.finance.analysis.core.service.impl;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.GoldExcelMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.dto.ExcelDTO;
import com.finance.analysis.core.service.GoldExcelService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class GoldExcelServiceImpl extends ServiceImpl<GoldExcelMapper, GoldData> implements GoldExcelService {

    @Override
    public void exportData(InputStream inputStream) {

    }

    @Override
    public List<ExcelDTO> listExcelData() {
        List<GoldData> excelList = baseMapper.selectList(null);
        ArrayList<ExcelDTO> excelDTOList = new ArrayList<>(excelList.size());
        excelList.forEach(d ->{
            ExcelDTO excelDTO = new ExcelDTO();
            BeanUtils.copyProperties(d, excelDTO);
            excelDTOList.add(excelDTO);
        });
        return excelDTOList;
    }
}
