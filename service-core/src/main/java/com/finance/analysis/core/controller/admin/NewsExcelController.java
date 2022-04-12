package com.finance.analysis.core.controller.admin;

import com.alibaba.excel.EasyExcel;
import com.finance.analysis.core.pojo.entity.dto.NewsExcelDTO;
import com.finance.analysis.core.pojo.entity.dto.NonFarmExcelDTO;
import com.finance.analysis.core.service.NewsCCTVDataService;
import com.finance.analysis.core.service.NewsExcelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/core/news")
public class NewsExcelController {

    @Resource
    private NewsExcelService newsExcelService;

    @GetMapping("/export")
    @CrossOrigin(origins = "*")
    public void export(HttpServletResponse response) {
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String fileName = URLEncoder.encode("news", "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
            EasyExcel.write(response.getOutputStream(), NewsExcelDTO.class).sheet("news").doWrite(newsExcelService.listExcelData());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
