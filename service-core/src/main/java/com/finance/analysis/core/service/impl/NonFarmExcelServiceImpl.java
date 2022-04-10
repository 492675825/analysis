package com.finance.analysis.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.finance.analysis.core.mapper.NonFarmDataMapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.pojo.entity.NonFarmData;
import com.finance.analysis.core.pojo.entity.dto.ExcelDTO;
import com.finance.analysis.core.pojo.entity.dto.NonFarmExcelDTO;
import com.finance.analysis.core.service.NonFarmExcelService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class NonFarmExcelServiceImpl extends ServiceImpl<NonFarmDataMapper, NonFarmData> implements NonFarmExcelService {
    @Override
    public void exportExcel(InputStream inputStream) {

    }

    @Override
    public List<NonFarmExcelDTO> listExcelData() {
        List<NonFarmData> excelList = baseMapper.selectList(null);
        ArrayList<NonFarmExcelDTO> excelDTOList = new ArrayList<>(excelList.size());
        excelList.forEach(d ->{
            NonFarmExcelDTO nonFarmExcelDTO = new NonFarmExcelDTO();
            BeanUtils.copyProperties(d, nonFarmExcelDTO);
            excelDTOList.add(nonFarmExcelDTO);
        });
        return excelDTOList;
    }
}
