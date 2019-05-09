package com.baizhi.controller;

import com.baizhi.entity.City;
import com.baizhi.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/findCityByPId")
    public @ResponseBody
    List<City> findCityByPid(String pid) {
        //2222
        List<City> cities = cityService.findCityByPid(pid);
        return cities;
    }


}
