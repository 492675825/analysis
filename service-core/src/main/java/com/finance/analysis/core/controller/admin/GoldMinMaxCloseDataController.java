package com.finance.analysis.core.controller.admin;

import com.finance.analysis.core.service.GoldMaxEarningRateService;
import com.finance.analysis.core.service.GoldMinMaxCloseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/admin/core/gold")
public class GoldMinMaxCloseDataController {
    @Resource
    private GoldMinMaxCloseService goldMinMaxCloseService;

    @GetMapping("/minMaxClose")
    public Map<String, Object> earningRate(){
        Map<String, Object> context = new HashMap<>();
        context.put("code",0);
        context.put("msg","success");
        context.put("data",goldMinMaxCloseService.minMaxClose());
        return context;
    }
}
