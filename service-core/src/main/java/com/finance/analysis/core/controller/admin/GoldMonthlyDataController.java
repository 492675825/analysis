package com.finance.analysis.core.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.service.GoldMonthlyDataService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/admin/core/gold")
public class GoldMonthlyDataController {
    @Resource
    private GoldMonthlyDataService goldMonthlyDataService;

    @GetMapping("/monthly_data")
    public Map<String, Object> listAll(){
        Map<String, Object> context = new HashMap<>();
        context.put("code",0);
        context.put("msg","success");
        context.put("data",goldMonthlyDataService.groupbyData());
        return context;
    }
}
