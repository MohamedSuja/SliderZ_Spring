package com.sliderz.sliderz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sliderz.sliderz.modals.ConfigurationModal;

@RestController
public class ConfigurationController {
    @Autowired
    private ConfigurationModal configuration;


    @RequestMapping("/configuration")
    public ConfigurationModal getConfiguration() {
        return configuration;
    }
    

    
}
