package com.finance.analysis.core.controller.admin;

import com.finance.analysis.core.pojo.entity.GoldData;
import com.finance.analysis.core.service.GoldDailyDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/admin/core/gold")
public class GoldDailyDataController {
    @Resource
    private GoldDailyDataService goldDailyDataService;

    //所有数据
    @GetMapping("/daily_data")
    public Map<String, Object> listAll() {
        List<GoldData> list = goldDailyDataService.list();
        Map<String, Object> context = new HashMap<>();
        context.put("code", 0);
        context.put("message", "success");
        context.put("data", list);
        return context;
    }

    //分页
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getPage", method = RequestMethod.POST)
    public Map<String, Object> getPage(@RequestParam("currentPage") int currentPage, @RequestParam("pageSize") int pageSize) {

        Map<String, Object> context = new HashMap<>();
        context.put("code", 0);
        context.put("message", "success");
        context.put("data", goldDailyDataService.selectByPage(currentPage, pageSize));
        return context;
    }

}
