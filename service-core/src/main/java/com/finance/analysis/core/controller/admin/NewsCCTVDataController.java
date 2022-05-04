package com.finance.analysis.core.controller.admin;

import com.finance.analysis.core.service.NewsCCTVDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/core/news")
public class NewsCCTVDataController {

    @Resource
    private NewsCCTVDataService newsCCTVDataService;

    //分页
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getPage", method = RequestMethod.POST)
    public Map<String, Object> getPage(@RequestParam("currentPage") int currentPage, @RequestParam("pageSize") int pageSize) {

        Map<String, Object> context = new HashMap<>();
        context.put("code", 0);
        context.put("message", "success");
        context.put("data", newsCCTVDataService.selectByPage(currentPage, pageSize));
        return context;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "filter_by_date", method = RequestMethod.POST)
    public Map<String, Object> filter_by_date(@RequestParam("select_date") String selectDate) {
        Map<String, Object> context = new HashMap<>();
        context.put("code", 0);
        context.put("msg", "success");
        context.put("data", newsCCTVDataService.selectByDate(selectDate));
        return context;
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "filter_by_news_type", method = RequestMethod.POST)
    public Map<String, Object> filter_by_type(@RequestParam("select_type") String news_type) {
        Map<String, Object> context = new HashMap<>();
        context.put("code", 0);
        context.put("msg", "success");
        context.put("data", newsCCTVDataService.selectByNewsType(news_type));
        return context;

    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "filter_by_date_and_type", method = RequestMethod.POST)
    public Map<String, Object> filter_by_date_and_type(@RequestParam("select_type") String select_type, @RequestParam("select_date") String select_date) {
        Map<String, Object> context = new HashMap<>();
        context.put("code",0);
        context.put("msg","success");
        context.put("data", newsCCTVDataService.selectByDateAndType(select_date, select_type));
        return context;
    }
}
