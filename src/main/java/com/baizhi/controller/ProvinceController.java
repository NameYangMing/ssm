package com.baizhi.controller;

import com.baizhi.entity.Province;
import com.baizhi.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/province")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @RequestMapping("/showAllProvince")
    public String showAllProvince(HttpServletRequest request) {
        List<Province> provinces = provinceService.queryAll();
        request.setAttribute("province", provinces);
        return "city";
    }


}
