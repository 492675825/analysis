package com.finance.analysis.core.controller.admin;

import com.alibaba.excel.EasyExcel;
import com.finance.analysis.core.pojo.entity.dto.ExcelDTO;
import com.finance.analysis.core.service.GoldExcelService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
@RequestMapping(value = "/admin/core/gold")
public class GoldExcelController {
    @Resource
    private GoldExcelService goldExcelService;

    @GetMapping("/export")
    @CrossOrigin(origins = "*")
    public void export(HttpServletResponse response){
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String fileName = URLEncoder.encode("gold", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
            EasyExcel.write(response.getOutputStream(), ExcelDTO.class).sheet("gold_price").doWrite(goldExcelService.listExcelData());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
