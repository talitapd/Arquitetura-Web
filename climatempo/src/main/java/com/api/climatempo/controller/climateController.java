package com.api.climatempo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.climatempo.service.ClimateService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping(" /climate")
public class climateController{

    @Autowired
    private ClimateService weatherService;

    @GetMapping("/{country}")
    public JsonNode getClimate(@PathVariable String country) {
        return weatherService.getClimate(country);
    }

    @GetMapping("/rain/{id}")
    public JsonNode getClimateRain(@PathVariable String id) {
        return weatherService.getClimateRain(id);
    }

}
