package com.lp.controller;

import com.lp.model.Popu;
import com.lp.service.PopuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PopuController {
    @Autowired
    private PopuService popuService;

    @RequestMapping("toJsp")
    public String toJsp() {
        return "echartsDemo";
    }
    @RequestMapping("queryData")
    @ResponseBody
    public List<Popu> queryData() {


        return  popuService.queryData();
    }


}
