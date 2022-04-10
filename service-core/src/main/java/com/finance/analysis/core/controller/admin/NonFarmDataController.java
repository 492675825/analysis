package com.finance.analysis.core.controller.admin;


import com.finance.analysis.core.pojo.entity.NonFarmData;
import com.finance.analysis.core.service.NonFarmDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/admin/core/nonfarm")
public class NonFarmDataController {
    @Resource
    private NonFarmDataService nonFarmDataService;


    //分页
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public Map<String, Object> getPage(@RequestParam("currentPage") int currentPage, @RequestParam("pageSize") int pageSize){
        Map<String, Object> context = new HashMap<>();
        context.put("code",0);
        context.put("msg","success");
        context.put("data", nonFarmDataService.selectNonFarmData(currentPage, pageSize));
        return context;
    }
}
