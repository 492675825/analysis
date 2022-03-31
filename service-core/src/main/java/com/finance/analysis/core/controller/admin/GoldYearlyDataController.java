package com.finance.analysis.core.controller.admin;

import com.finance.analysis.core.service.GoldYearlyDataService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RequestMapping(value = "/admin/core/gold")
@RestController
public class GoldYearlyDataController {
    @Resource
    private GoldYearlyDataService goldYearlyDataService;

    @GetMapping("/yearly_data")
    public Map<String, Object> allList(){
        Map<String, Object> context = new HashMap<>();
        context.put("code",0);
        context.put("msg","success");
        context.put("data", goldYearlyDataService.yearlyData());
        return context;
    }
}
