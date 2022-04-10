package com.finance.analysis.core.controller.admin;

import com.finance.analysis.core.service.GoldChartsPanelService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value = "/admin/core/gold")
public class GoldChartsPanelController {
    @Resource
    private GoldChartsPanelService goldChartsPanelService;

    @GetMapping("/chart_card")
    public Map<String, Object> allList(){
        Map<String, Object> context = new HashMap<>();
        context.put("code",0);
        context.put("msg","success");
        context.put("data", goldChartsPanelService.selectMaxVersionDate());
        return context;
    }
}
